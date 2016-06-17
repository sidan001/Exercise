/**
 * @Description: TODO
 */
package com.exercise.Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		int cy = LocalDate.now().getYear();
		int by = birthday.getYear();
		return cy - by;
	}

	public void printPerson() {
		System.out.println(toString());
	}

	/**
	 * @return
	 * 
	 */
	public Sex getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", gender="
				+ gender + ", emailAddress=" + emailAddress + "]";
	}

	/**
	 * @return
	 * 
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	public Person(String name, LocalDate birthday, Sex gender,
			String emailAddress) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}

	/**
	 * @return
	 * 
	 */
	public static List<Person> createRoster() {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("google", LocalDate.of(1988, 2, 20), Sex.FEMALE, "google@google.com"));
		list.add(new Person("apple", LocalDate.of(1992, 12, 20), Sex.MALE, "apple@apple.com"));
		list.add(new Person("twitter", LocalDate.of(2010, 3, 20), Sex.FEMALE, "twitter@twitter.com"));
		list.add(new Person("ewedata", LocalDate.of(1998, 9, 20), Sex.FEMALE, "ewedata@ewedata.com"));
		return list;
	}

}
