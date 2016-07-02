package com.exercise.essential_classes.basci_io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * By default, a scanner uses white space to separate tokens.
 *
 */
public class ScanXan {
	
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
//            s.useDelimiter(",\\s*");//use a different token separator
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}