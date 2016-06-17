/**
* @Description: TODO
 */
package com.exercise.overridingmethods.Interfacemethods;

import com.sun.org.apache.xml.internal.security.encryption.EncryptedKey;

/**
 * You can use the super keyword to invoke a default method in both classes and interfaces.
 */
public class FlyingCar implements OperateCar, FlyCar {
    @Override
	public void startEngine(EncryptedKey key) {
        FlyCar.super.startEngine(key);
        OperateCar.super.startEngine(key);
    }
}
