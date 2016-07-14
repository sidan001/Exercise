/**
 * @Description: TODO
 */
package com.exercise.collections.aggregate_operations;

import java.util.function.IntConsumer;

class Averager implements IntConsumer {
	private int total = 0;
	private int count = 0;

	public double average() {
		return count > 0 ? ((double) total) / count : 0;
	}

	@Override
	public void accept(int i) {
		System.out.println(this.hashCode()+" accpept: "+i);
		total += i;
		count++;
	}

	public void combine(Averager other) {
		System.out.println(this.hashCode() +" combine other.total: +"+other.total+",other.count: " + other.count );
		
		total += other.total;
		count += other.count;
	}
	
	Averager(){
		System.out.println(this.hashCode() + "Averager construct invoking");
	}
	
	
}