/**
 * @Description: TODO
 */
package com.exercise.essential_classes.environment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {

		// create and load default properties
		Properties defaultProps = new Properties();
		FileInputStream in = new FileInputStream("defaultProperties");
		defaultProps.load(in);
		in.close();

		// create application properties with default
		Properties applicationProps = new Properties(defaultProps);

		// now load properties  from last invocation
		in = new FileInputStream("appProperties");
		applicationProps.load(in);
		in.close();
		
		FileOutputStream out = new FileOutputStream("appProperties");
		applicationProps.store(out, "---No Comment---");
		out.close();
		
	}
}
