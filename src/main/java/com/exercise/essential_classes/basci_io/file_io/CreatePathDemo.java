package com.exercise.essential_classes.basci_io.file_io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePathDemo {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.home"));
		Path p5 = Paths.get(System.getProperty("user.home"), "logs", "foo.log");
		System.out.println(p5.getName(0));
		System.out.format("%s%n", p5.toUri());
		System.out.println(p5.toAbsolutePath());
//		System.out.println(p5.toRealPath());
		
		
		
		Path p_resolve = Paths.get("/home/joe/foo");
		// Result is /home/joe/foo/bar
		System.out.format("%s%n", p_resolve.resolve("bar"));
		
		System.out.println(Paths.get("foo").resolve("/home/joe").toAbsolutePath());
		
		Path p1 = Paths.get("home");
		Path p3 = Paths.get("home/sally/bar");
		// Result is sally/bar
		Path p1_to_p3 = p1.relativize(p3);
		System.out.println(p1_to_p3.toAbsolutePath());
		// Result is ../..
		Path p3_to_p1 = p3.relativize(p1);
		System.out.println(p3_to_p1.toAbsolutePath());
		
	}
}
