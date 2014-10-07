package com.williamleara.utexas.mastersreport;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Vfr {
	
    public static class VfrToHTML extends vfrBaseListener {
    	
    	// name of the files that will hold the VFR preview
    	static String fileNameMain = "vfr_preview.html";
    	static String fileNameHead = "head.html";
    	static String fileNameBody = "body.html";
    	
    	// set of strings associated with the VFR
    	static String strFile = "strings.txt";
    	
    	// database of identifier to string mappings
    	Map<String, String> strDatabase = new HashMap<String, String>();
    	
    	// stack of properties
    	Deque<String> propertyStack = new ArrayDeque<String>();
    	
    	// stack of strings that go with each property
    	Deque<String> stringTokenStack = new ArrayDeque<String>();
    	
    	boolean inVfrStatementHeader = false;
    	boolean gotTitle = false;
    	int columnCount = 0;
    	
    	public VfrToHTML() {
    	      
    		// remove output files from any previous runs
			List<File> filesToDelete = new ArrayList<File>();
			filesToDelete.add(new File(fileNameMain));
			filesToDelete.add(new File(fileNameHead));
			filesToDelete.add(new File(fileNameBody));
			  
			for (File f : filesToDelete) {
			    if (f.exists())
			  	  f.delete();
			}
			
			// populate string values from strings file
			File f = new File(strFile);
			BufferedReader reader = null;

			try {
			    reader = new BufferedReader(new FileReader(f));
			    String stringMapping = null;
			    while ((stringMapping = reader.readLine()) != null) {
			    	StringTokenizer st = new StringTokenizer(stringMapping, ",");
			    	String key = st.nextToken();
			    	String value = st.nextToken();
			    	strDatabase.put(key, value);
			    }
			} catch (Exception ex) {
				System.out.println(ex);
			}
    	}
    	
    	// create header upon entering the form
    	public void enterVfrFormDefinition(vfrParser.VfrFormDefinitionContext ctx) {
    		emitHeader();
    	}

    	// create footer as we leave the form
    	public void exitVfrFormDefinition(vfrParser.VfrFormDefinitionContext ctx) {
    		emitFooter();
    	}
    	
    	/* upon entering a VFR statement, we can ascertain whether or not
    	 * "prompt" and/or "help" properties exist.  So, look for them
    	 * here and push them on the stack.
    	 */
    	public void enterVfrStatementHeader(vfrParser.VfrStatementHeaderContext ctx) {
        	inVfrStatementHeader = true;  // ensure we don't push/pop outside checkboxes
    		for (int i=0; i<ctx.getChildCount(); i++) {
    			if (ctx.getChild(i).getText().equals("help"))
    				propertyStack.push("help");
    			if (ctx.getChild(i).getText().equals("prompt"))
    				propertyStack.push("prompt");
    		}
    	}
    	    	
    	public void exitVfrStatementHeader(vfrParser.VfrStatementHeaderContext ctx) {
    		// ensure we don't push/pop outside checkboxes
    		inVfrStatementHeader = false;
    	}
    	
    	/* leaving GetStringId we know the value of the string,
    	so push it onto the stack. */
    	public void exitGetStringId(vfrParser.GetStringIdContext ctx) {
    		
    		if (!gotTitle) {
        		PrintWriter writer = null;
        		try {
        			writer = new PrintWriter(new BufferedWriter(new FileWriter(fileNameHead, true)));
        		} catch (Exception ex) {
        			System.out.println(ex);
        		}
    			String title = ctx.getText();
    			title = title.replace("STRING_TOKEN", "");
    			title = title.replace("(", "");
    			title = title.replace(")", "");
        		writer.write("<h3>" + strDatabase.get(title) + "</h3>");
        		writer.close();
    			gotTitle = true;
    		}
    		
    		if (inVfrStatementHeader == true) {
    			String stringId = ctx.getText();
    			stringId = stringId.replace("STRING_TOKEN", "");
    			stringId = stringId.replace("(", "");
    			stringId = stringId.replace(")", "");
    			stringTokenStack.push(strDatabase.get(stringId));
    		}
    	}
    	
    	public void exitVfrStatementCheckBox(vfrParser.VfrStatementCheckBoxContext ctx) {
    		Map<String, String> checkboxProperties = new HashMap<String, String>();
    		PrintWriter writer = null;
    		
    		// populate the HashMap with the properties discovered during tree traversal
    		while (!propertyStack.isEmpty() && !stringTokenStack.isEmpty())
    			checkboxProperties.put(propertyStack.pop(), stringTokenStack.pop());
    		
    		// update the header part of the HTML page
    		try {
    			writer = new PrintWriter(new BufferedWriter(new FileWriter(fileNameHead, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		
    		// use % to write the checkboxes in two columns
    		if ((columnCount % 2) == 1)
    			writer.write("<input type=\"checkbox\" checked=\"checked\" name=\"vfr\" value=\"value\">" + 
    					checkboxProperties.get("prompt") + "<br>");
    		else
    			writer.write("<input type=\"checkbox\" checked=\"checked\" name=\"vfr\" value=\"value\">" + 
    					checkboxProperties.get("prompt"));
    		writer.close();
    		columnCount++;
    		
    		// update the body part of the HTML page
    		try {
    			writer = new PrintWriter(new BufferedWriter(new FileWriter(fileNameBody, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		writer.write("<p>" + checkboxProperties.get("help") + "</p>");
    		writer.close();
    	}
  
        void emitHeader() {
    		PrintWriter mainWriter = null;
    		PrintWriter headWriter = null;
    		PrintWriter bodyWriter = null;
  		
    		// write beginning contents of the main frameset
    		try {
    			mainWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileNameMain, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		mainWriter.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
    		mainWriter.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
    		mainWriter.write("<head>");
    		mainWriter.write("</head>");
    		mainWriter.write("<frameset rows=\"150,*\">");
    		mainWriter.write("<frame src=\"head.html\" scrolling=\"no\">");
    		mainWriter.write("<frame src=\"body.html\" scrolling=\"no\">");		
    		mainWriter.close();
    		
    		// write beginning contents of the header frame
    		try {
    			headWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileNameHead, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		headWriter.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
    		headWriter.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
    		headWriter.write("<body bgcolor=\"#dde3f1\">");
    		headWriter.write("<form action=\"\">");
    		headWriter.close();
    		
    		// write beginning contents of the body frame
    		try {
    			bodyWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileNameBody, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		bodyWriter.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
    		bodyWriter.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
    		bodyWriter.write("<body bgcolor=\"#dde3f1\">");
    		bodyWriter.close();
        }
        
        void emitFooter() {
    		PrintWriter mainWriter = null;
    		PrintWriter headWriter = null;
    		PrintWriter bodyWriter = null;
    		
    		// write final contents of the body frame
    		try {
    			bodyWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileNameBody, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		bodyWriter.write("</body>");
    		bodyWriter.write("</html>");
    		bodyWriter.close();
    		
    		// write final contents of the header frame
    		try {
    			headWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileNameHead, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		headWriter.write("</form>");
    		headWriter.write("</body>");
    		headWriter.write("</html>");
    		headWriter.close();
    		
    		// write final contents of the main frameset
    		try {
    			mainWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileNameMain, true)));
    		} catch (Exception ex) {
    			System.out.println(ex);
    		}
    		mainWriter.write("</frameset>");
    		mainWriter.write("</html>");	
    		mainWriter.close();
        }
    }

    public static void main(String[] args) throws Exception {
    	
    	// check for input file
        if (args.length <= 0) {
        	System.out.println("ERROR: missing input file");
        	System.exit(1);
        }
        
        // create file input stream
        String inputFile = null;
    	inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile != null )
        	is = new FileInputStream(inputFile);
        
        // create lexer and parser
        vfrLexer lexer = new vfrLexer(new ANTLRInputStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        vfrParser parser = new vfrParser(tokens);
        parser.setBuildParseTree(true);
        ParserRuleContext tree = parser.vfrFormDefinition();
        ParseTreeWalker walker = new ParseTreeWalker();
        
        // perform analysis
        VfrToHTML vfrHTML = new VfrToHTML();
        walker.walk(vfrHTML, tree);
    }
}
