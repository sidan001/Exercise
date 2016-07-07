/**
 * @Description: TODO
 */
package com.exercise.essential_classes.environment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PersistentEcho {
	public static void main(String[] args) {
		String argString = "";
		boolean notProperty = true;

		// Are there arguments?If so retrieve them.
		if (args.length > 0) {
			for (String arg : args) {
				argString += arg + " ";
			}
			argString = argString.trim();//any leading and trailing whitespace removed
		} else if ((argString = System.getenv("PERSISTENTECHO")) != null) {// No arguments, is therean environment variable? If so, retrieve it.
			
		} else {// No environment variable either. Retrieve property value.
			
			notProperty = false;
			// Set argString to null.If it's still null afterwe exit the tryblock,
			// we've failed to retrieve the property value.
			argString = null;
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream("PersistentEcho.txt");
				Properties inProperties = new Properties();
				inProperties.load(fileInputStream);
				argString = inProperties.getProperty("argString");
			} catch (IOException e) {
				System.err.println("Can't read property file.");
				System.exit(1);
			} finally {
				if (fileInputStream != null) {
					try {
						fileInputStream.close();
					} catch (IOException e) {
					}
				}
			}
		}
		if (argString == null) {
			System.err.println("Couldn't find argString property");
			System.exit(1);
		}

		// Somehow, we got the value. Echo it already!
		System.out.println(argString);

		// If we didn't retrieve thevalue from the property,save it //in the
		// property.
		if (notProperty) {
			Properties outProperties = new Properties();
			outProperties.setProperty("argString", argString);
			FileOutputStream fileOutputStream = null;
			try {
				fileOutputStream = new FileOutputStream("PersistentEcho.txt");
				outProperties.store(fileOutputStream,
						"PersistentEcho properties");
			} catch (IOException e) {
			} finally {
				if (fileOutputStream != null) {
					try {
						fileOutputStream.close();
					} catch (IOException e) {
					}
					;
				}
			}
		}
	}
}