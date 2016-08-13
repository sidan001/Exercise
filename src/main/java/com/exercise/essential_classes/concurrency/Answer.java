/**
 * @Description: TODO
 */
package com.exercise.essential_classes.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Answer {

	public static int answer(int[] numbers) {
		List<Integer> pirates = new ArrayList<Integer>();
		int i = 0;
		while (true) {

			if (pirates.contains(i)) {
				System.out.printf("pirates: %s  ,pirates.indexOf(%s) == %s %n",pirates,i,pirates.indexOf(i));
				return pirates.size() - pirates.indexOf(i);
			}
			pirates.add(i);

			i = numbers[i];
		}
	}
	public static int[][] answer(int[][] polulation ,int x, int y ,int strength) {

		
		return null;
	}

	public static void main(String[] args) {
		int [] numbers = {1, 2, 3,4,5,2};
		int answer = Answer.answer(numbers);
		System.out.println(answer);
	}

}
