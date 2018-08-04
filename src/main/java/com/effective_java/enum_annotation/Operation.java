package com.effective_java.enum_annotation;

// Enum type with constant-specific method implementations
public enum Operation {
    PLUS { double apply(double x, double y){return x + y;} },
    MINUS { double apply(double x, double y){return x - y;} },
    TIMES { double apply(double x, double y){return x * y;} },
    DIVIDE { double apply(double x, double y){return x / y;} };

    abstract double apply(double x, double y);
}