/**
* @Description: TODO
 */
package com.exercise.essential_classes.exceptions;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoggingApi {

	
	public static void main(String[] args) {
		LoggingApi.testLoggingApi();
	}
	
	public static void testLoggingApi(){
		try {
		    Handler handler = new FileHandler("OutFile.log");
		    Logger logger =Logger.getLogger("");
		    logger.addHandler(handler);
		    
		} catch (IOException e) {
		    Logger logger = Logger.getLogger("package.name"); 
		    StackTraceElement elements[] = e.getStackTrace();
		    for (int i = 0, n = elements.length; i < n; i++) {
		        logger.log(Level.WARNING, elements[i].getMethodName());
		    }
		}
	}
}
