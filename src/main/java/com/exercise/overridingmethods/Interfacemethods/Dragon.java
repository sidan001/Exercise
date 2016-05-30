/**
 * @Description: TODO
 */
package com.exercise.overridingmethods.Interfacemethods;

/**
 * Methods that are already overridden by other candidates are ignored. 
 * This circumstance can arise when supertypes share a common ancestor.
 */
interface Animal {
	default public String identifyMyself() {
		return "I am an animal.";
	}
}

interface EggLayer extends Animal {
	@Override
	default public String identifyMyself() {
		return "I am able to lay eggs.";
	}
}

interface FireBreather extends Animal {

}

public class Dragon implements EggLayer, FireBreather {
	public static void main(String... args) {
		FireBreather myApp = new Dragon();
		System.out.println(myApp.identifyMyself());
	}
}