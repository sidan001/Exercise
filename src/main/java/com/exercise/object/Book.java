/**
 * @Description: TODO
 */
package com.exercise.object;

public class Book {

	private String ISBN;

	public Book(String iSBN) {
		super();
		ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		return true;
	}
	
	
	public static void main(String[] args) {
		Book firstBook  = new Book("0201914670");
		Book secondBook = new Book("0201914670");
		if (firstBook.equals(secondBook)) {
		    System.out.println("objects are equal");
		} else {
		    System.out.println("objects are not equal");
		}
	}
}
