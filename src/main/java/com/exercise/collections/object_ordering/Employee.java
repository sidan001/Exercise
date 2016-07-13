/**
 * @Description: TODO
 */
package com.exercise.collections.object_ordering;

import java.util.Date;

public class Employee implements Comparable<Employee>{
	
	private Name name;
	private int number;
	private Date hireDate;
	
	
	public Employee(Name name, int number, Date hireDate) {
		super();
		if (name == null || hireDate == null )
            throw new NullPointerException();
		this.name = name;
		this.number = number;
		this.hireDate = hireDate;
	}

	public Name name()     { return name; }

	public int number()    { return number; }

	public Date hireDate() {  return hireDate; }

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", hireDate="
				+ hireDate + "]";
	}
	
	
}
