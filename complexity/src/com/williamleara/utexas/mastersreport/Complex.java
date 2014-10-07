package com.williamleara.utexas.mastersreport;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class Complex {
	
	// data structure for parsing results
	public static Map<String, Integer> vectors_of_complexity = new HashMap<String, Integer>();
	
    public static class ComplexityAnalyzer extends UefiBaseListener {
    	
    	// weights for each vector of complexity
    	public static final int NUMSTATEMENTS_WEIGHT = 1;
    	public static final int PROTOCOLS_WEIGHT = 1;
    	public static final int VARIABLESERVICES_WEIGHT = 1;
    	public static final int CALLBACKS_WEIGHT = 1;
    	public static final int BLOCKIO_WEIGHT = 1;
    	public static final int MALLOC_WEIGHT = 1;
    	
    	// data structures for each vector
    	List<String> protocolHandlers = new ArrayList<String>();
    	List<String> variableServices = new ArrayList<String>();
    	List<String> callbacks = new ArrayList<String>();
    	List<String> blockIo= new ArrayList<String>();
    	List<String> memAlloc= new ArrayList<String>();
    	
    	public ComplexityAnalyzer() {
    		// initialize data structure
    		vectors_of_complexity.put("NumStatements", 0);
    		vectors_of_complexity.put("Protocols", 0);
    		vectors_of_complexity.put("VariableServices", 0);
    		vectors_of_complexity.put("Callbacks", 0);
    		vectors_of_complexity.put("BlockIo", 0);
    		vectors_of_complexity.put("MemAlloc", 0);
    		
    		// initialize ArrayList:  protocol handlers
    		protocolHandlers.add("InstallProtocolInterface");
    		protocolHandlers.add("UninstallProtocolInterface");
    		protocolHandlers.add("ReinstallProtocolInterface");
    		protocolHandlers.add("RegisterProtocolNotify");
    		protocolHandlers.add("LocateHandle");
    		protocolHandlers.add("HandleProtocol");
    		protocolHandlers.add("LocateDevicePath");
    		protocolHandlers.add("OpenProtocol");
    		protocolHandlers.add("CloseProtocol");
    		protocolHandlers.add("OpenProtocolInformation");
    		protocolHandlers.add("ConnectController");
    		protocolHandlers.add("DisconnectController");
    		protocolHandlers.add("ProtocolsPerHandle");
    		protocolHandlers.add("LocateHandleBuffer");
    		protocolHandlers.add("LocateProtocol");
    		protocolHandlers.add("InstallMultipleProtocolInterfaces");
    		protocolHandlers.add("UninstallMultipleProtocolInterfaces");
    		
    		// initialize ArrayList:  variable services
    		variableServices.add("GetVariable");
    		variableServices.add("GetNextVariableName");
    		variableServices.add("SetVariable");
    		variableServices.add("QueryVariableInfo");
    		
    		// initialize ArrayList:  callbacks
    		callbacks.add("CreateEvent");
    		callbacks.add("CreateEventEx");
    		callbacks.add("CloseEvent");
    		callbacks.add("SignalEvent");
    		callbacks.add("WaitForEvent");
    		callbacks.add("CheckEvent");
    		callbacks.add("SetTimer");
    		callbacks.add("RaiseTPL");
    		callbacks.add("RestoreTPL");
    		
    		// initialize ArrayList:  block io devices
    		blockIo.add("EFI_BLOCK_IO_PROTOCOL");
    		blockIo.add("EFI_BLOCK_IO2_PROTOCOL");
    		
    		// initialize ArrayList:  memory allocation
    		memAlloc.add("AllocatePages");
    		memAlloc.add("FreePages");
    		memAlloc.add("GetMemoryMap");
    		memAlloc.add("AllocatePool");
    		memAlloc.add("FreePool");
    	}
    	
    	// listener for number of statements
    	public void enterStatement(UefiParser.StatementContext ctx) {
    		vectors_of_complexity.put("NumStatements", vectors_of_complexity.get("NumStatements") + 1*NUMSTATEMENTS_WEIGHT);
    	}
    	
    	// listener for expressions
    	public void enterTypedefName(UefiParser.TypedefNameContext ctx) {
    		
   		// protocol handler services
    	if (protocolHandlers.contains(ctx.getText()))
			vectors_of_complexity.put("Protocols", vectors_of_complexity.get("Protocols") + 1*PROTOCOLS_WEIGHT);
    	// variable services
		else if (variableServices.contains(ctx.getText()))
			vectors_of_complexity.put("VariableServices", vectors_of_complexity.get("VariableServices") + 1*VARIABLESERVICES_WEIGHT);
    	// event and timer callbacks
		else if (callbacks.contains(ctx.getText()))
			vectors_of_complexity.put("Callbacks", vectors_of_complexity.get("Callbacks") + 1*CALLBACKS_WEIGHT);
    	// block io
		else if (blockIo.contains(ctx.getText()))
			vectors_of_complexity.put("BlockIo", vectors_of_complexity.get("BlockIo") + 1*BLOCKIO_WEIGHT);
    	// memory allocation
		else if (memAlloc.contains(ctx.getText()))
			vectors_of_complexity.put("MemAlloc", vectors_of_complexity.get("MemAlloc") + 1*MALLOC_WEIGHT);
    	}
    }

    public static void main(String[] args) throws Exception {
    	
    	// check for input file
        String inputFile = null;
        if (args.length <= 0) {
        	System.out.println("ERROR: missing input file");
        	System.exit(1);
        }
        
        // main program loop
        ComplexityAnalyzer cmplx = new ComplexityAnalyzer();
        for (int i=0; i<args.length; i++) {
        	inputFile = args[i];
	        InputStream is = System.in;
	        if ( inputFile != null )
	        	is = new FileInputStream(inputFile);
	        
	        // create lexer and parser
	        UefiLexer lexer = new UefiLexer(new ANTLRInputStream(is));
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        UefiParser parser = new UefiParser(tokens);
	        parser.setBuildParseTree(true);
	        ParserRuleContext tree = parser.compilationUnit();
	        ParseTreeWalker walker = new ParseTreeWalker();
	        
	        // perform analysis       
	        walker.walk(cmplx, tree);
        }
        
        // print results
        System.out.println("Component Scores:");
        System.out.println("NumStatements: " + vectors_of_complexity.get("NumStatements"));
        System.out.println("Protocols: " + vectors_of_complexity.get("Protocols"));
        System.out.println("VariableServices: " + vectors_of_complexity.get("VariableServices"));
        System.out.println("Callbacks: " + vectors_of_complexity.get("Callbacks"));
        System.out.println("BlockIo: " + vectors_of_complexity.get("BlockIo"));
        System.out.println("MemAlloc: " + vectors_of_complexity.get("MemAlloc"));
        
        System.out.print("\nComposite Score: ");
        System.out.println(
        		vectors_of_complexity.get("NumStatements") +
        		vectors_of_complexity.get("Protocols") +
        		vectors_of_complexity.get("VariableServices") +
        		vectors_of_complexity.get("Callbacks") +
        		vectors_of_complexity.get("BlockIo") +
        		vectors_of_complexity.get("MemAlloc")
        );
    }
}
