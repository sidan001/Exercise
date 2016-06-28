/**
 * @Description: TODO
 */
package com.exercise.essential_classes.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

	private List<Integer> list;
	private static final int SIZE = 10;

	
	public ListOfNumbers() {
		this.list = new ArrayList<Integer>();
		for(int i=0;i<SIZE;i++){
			this.list.add(i);
		}
	}


	public void writeList() {
	    PrintWriter out = null;

	    try {
	        System.out.println("Entering" + " try statement");

	        out = new PrintWriter(new FileWriter("D:\\OutFile.txt"));
	        for (int i = 0; i < SIZE; i++) {
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	    } catch (IndexOutOfBoundsException e) {
	        System.err.println("Caught IndexOutOfBoundsException: " +  e.getMessage());
	                                 
	    } catch (IOException e) {
	        System.err.println("Caught IOException: " +  e.getMessage());
	                                 
	    } finally {
	        if (out != null) {
	            System.out.println("Closing PrintWriter");
	            out.close();
	        } 
	        else {
	            System.out.println("PrintWriter not open");
	        }
	    }
	}
	
	public static void main(String[] args) {
		ListOfNumbers lon = new ListOfNumbers();
		lon.writeList();
	}
	
}
