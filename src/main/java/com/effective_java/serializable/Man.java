package com.effective_java.serializable;

import java.io.*;

public class Man extends Human implements Serializable {

    static final long serialVersionUID = 42L;

    public Man(String name) {
        super(name);
        System.out.println("Man Constructor invoked");
    }

    // readObjectNoData for stateful extendable serializable classes
    private void readObjectNoData() throws InvalidObjectException {
        throw new InvalidObjectException("Stream data required");
    }

    private void writeObject(ObjectOutputStream s)
            throws IOException {
        s.defaultWriteObject();
        // Manually serialize superclass state
        s.writeUTF(this.name);
    }

    private void readObject(ObjectInputStream in)throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.name = in.readUTF();
    }
}
