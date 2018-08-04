package com.effective_java.serializable;

import java.io.Serializable;


public class Hello implements Serializable {
    String gretting;
    int num;

    public Hello(String gretting, int num) {
        this.gretting = gretting;
        this.num = num;
    }

    public Hello() {
    }

    public String getGretting() {
        return gretting;
    }

    public int getNum() {
        return num;
    }
}
