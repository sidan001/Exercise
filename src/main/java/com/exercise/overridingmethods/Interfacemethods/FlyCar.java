/**
 * @Description: TODO
 */
package com.exercise.overridingmethods.Interfacemethods;

import com.sun.org.apache.xml.internal.security.encryption.EncryptedKey;

public interface FlyCar {
	default public void startEngine(EncryptedKey key) {
	}
}
