/**
 * @Description: TODO
 */
package com.exercise.Generic;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {
	private int i;

	public NaturalNumber(int i) {
		this.i = i;
	}
	
	
	
	public static void main(String[] args) {
		List<EvenNumber> le = new ArrayList<>();
		List<? extends NaturalNumber> ln = le;
//		ln.add(new NaturalNumber(35));  // compile-time error
		
/*		You can add null.
		You can invoke clear.
		You can get the iterator and invoke remove.
		You can capture the wildcard and write elements that you've read from the list.
*/	
		
	}
}

class EvenNumber extends NaturalNumber {

	public EvenNumber(int i) {
		super(i);
	}
	// ...
}