package com.exercise.essential_classes.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TryWithResourcesStatement {

	/**
	 * Because the BufferedReader instance is declared in a try-with-resource
	 * statement, it will be closed regardless of whether the try statement
	 * completes normally or abruptly (as a result of the method
	 * BufferedReader.readLine throwing an IOException).
	 */
	static String readFirstLineFromFile(String path) throws IOException {
		//try-with-resource
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
		
		//The resource type String does not implement java.lang.AutoCloseable		
//		try(String str = new String()){ // error
//		}
		
		
	}

	//uses a finally block instead of a try-with-resources statement:
	static String readFirstLineFromFileWithFinallyBlock(String path)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null)
				br.close();
		}
	}
	
	
	
}
