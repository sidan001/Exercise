/**
 * @Description: TODO
 */
package com.exercise.collections.traversing_collections;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class AggregateOperations {
	public static void main(String[] args) {
		Collection<Ball> c  = new ArrayList<Ball>();
		Ball black = new Ball("black",Color.BLACK,1);
		Ball white = new Ball("white",Color.WHITE,2);
		Ball red = new Ball("red",Color.RED,3);
		
		c.add(black);
		c.add(white);
		c.add(red);
		
         /*Aggregate Operations*/
		//filter
		c.stream().filter(e -> e.getColor().equals(Color.RED))
				.forEach(e -> System.out.format("The %s ball name is: %s.%n", e.getColor().toString(),e.getName()));
		//not filter
		c.stream().forEach(e -> System.out.format("The %s ball name is: %s.%n", e.getColor().toString(),e.getName()));
//		c.parallelStream().forEach(e ->  System.out.println(e.getName()));
		
		//convert the elements of a Collection to String objects, then join them, separated by commas:
		String jioned = c.stream().map(Ball::toString).collect(Collectors.joining(", "));
		System.out.println(jioned);
		
		//sum the weight of all Balls:
		int total = c.stream().collect(Collectors.summingInt(Ball::getWeight));
		System.out.format("sum the weight of all Balls == %s %n",total);
		
		
		/*Iterators*/
		for(Iterator<Ball> it = c.iterator();it.hasNext() ;){
			Ball ball  =it.next();
			if(ball.getColor().equals(Color.RED))
					System.out.println(ball.getName());
		}
		
	}
}

class Ball {
	String name;
	Color color;
	int weight;
	
	public Ball(String name, Color color,int weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Ball [name=" + name + ", color=" + color + "]";
	}
}
