package com.levent.base64bin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Base64;
import java.util.Base64.Decoder;

public class ConvertBase64 {
	
	private static final String USAGE			= "Usage: ConvertBase64 <input-file> <output-file>";
	private static final String EXPLANATION_1	= "\tinput-file  : Base64 decoded binary";
	private static final String EXPLANATION_2	= "\toutput-file : Output binary file to be written";
	private static final String EXAMPLE_HEADER	= "\tExample;";
	private static final String LINE			= "\t********";
	private static final String EXAMPLE			= "\tconvertbase64 source.txt final.rar";
	
	public static void main(String[] args) throws Exception {
		if(args.length != 2) {
			printMessages();
		} else {
			writeDecodedBinaryFile(args[0], args[1]);
		}
	}
	
	private static void printMessages() {
		System.out.println(USAGE);
		System.out.println();
		System.out.println(EXPLANATION_1);
		System.out.println(EXPLANATION_2);
		System.out.println();
		System.out.println(EXAMPLE_HEADER);
		System.out.println(LINE);
		System.out.println(EXAMPLE);
		System.out.println();
	}
	
	/*
	 * Write the content of the Base64 decoded file into a binary file
	 */
	private static void writeDecodedBinaryFile(String inputFilename, String outputFilename) throws Exception {
		// Read file and convert it to string
		String fileAsString = readFileAsString(inputFilename);
		Decoder decoder = Base64.getDecoder();
		byte[] data = decoder.decode(fileAsString);
		
		// Write file
		try (OutputStream stream = new FileOutputStream(outputFilename)) {
		    stream.write(data);
		}
	}
	
	/*
	 * Reads the file and return the file as a String instance
	 */
	private static String readFileAsString(String inputFilename) throws Exception {
		InputStream is = new FileInputStream(inputFilename);
		
		@SuppressWarnings("resource")
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		
		while(line != null){
			sb.append(line);
			line = buf.readLine();
		}
		
		String fileAsString = sb.toString();
		
		return fileAsString;
	}

}
