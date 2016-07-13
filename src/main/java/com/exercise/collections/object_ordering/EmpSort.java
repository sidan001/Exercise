/**
* @Description: TODO
 */
package com.exercise.collections.object_ordering;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
public class EmpSort {
    static final Comparator<Employee> SENIORITY_ORDER = 
                                        new Comparator<Employee>() {
            @Override
			public int compare(Employee e1, Employee e2) {
                return e2.hireDate().compareTo(e1.hireDate());
            }
    };


    public static void main(String[] args) {
    	Calendar c = Calendar.getInstance(Locale.CHINA);
    	Collection<Employee> employees = new ArrayList<Employee>();
    	
    	c.set(2011, 1, 1);
    	employees.add(new Employee(new Name("aa", "a"), 22, c.getTime()));
    	
    	c.set(2009, 1, 1);
    	employees.add(new Employee(new Name("bb", "b"), 32, c.getTime()));
    	
    	c.set(2009, 1, 1);
    	employees.add(new Employee(new Name("vv", "b"), 42, c.getTime()));
    	
        List<Employee> e = new ArrayList<Employee>(employees);
        Collections.sort(e, SENIORITY_ORDER);
        System.out.println(e);
    }
}