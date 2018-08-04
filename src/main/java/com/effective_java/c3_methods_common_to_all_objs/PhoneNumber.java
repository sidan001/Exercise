package com.effective_java.c3_methods_common_to_all_objs;


import java.util.HashMap;
import java.util.Map;

public class PhoneNumber implements Cloneable{
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix,
                       int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }
    private static void rangeCheck(int arg, int max,String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name +": " + arg);
    }
    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }
    // Broken - no hashCode method!


    @Override
    public int hashCode() {
        /*A nice property of 31 is that the
        multiplication can be replaced by a shift and a subtraction for better performance:
        31 * i == (i << 5) - i.*/
        int result = (int) areaCode;
        result = 31 * result + (int) prefix;//
        result = 31 * result + (int) lineNumber;
        return result;
    }

    /**
     * Returns the string representation of this phone number.
     * The string consists of fourteen characters whose format
     * is "(XXX) YYY-ZZZZ", where XXX is the area code, YYY is
     * the prefix, and ZZZZ is the line number. (Each of the
     * capital letters represents a single decimal digit.)
     *
     * If any of the three parts of this phone number is too small
     * to fill up its field, the field is padded with leading zeros.
     * For example, if the value of the line number is 123, the last
     * four characters of the string representation will be "0123".
     *
     * Note that there is a single space separating the closing
     * parenthesis after the area code from the first digit of the
     * prefix.
     */
    @Override public String toString() {
        return String.format("(%03d) %03d-%04d",
                areaCode, prefix, lineNumber);
    }

    @Override
    public PhoneNumber clone() throws CloneNotSupportedException {
        /*实现Cloneable接口，并重写clone()方法，修改返回类型和访问修饰符为public
        In this case, all you
        need do in addition to declaring that you implement Cloneable is to provide public
        access to Object’s protected clone method:*/
        return (PhoneNumber) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Map<PhoneNumber, String> m
                = new HashMap<PhoneNumber, String>();
        m.put(new PhoneNumber(707, 0, 5309), "Jenny");

        System.out.println(m.get(new PhoneNumber(0, 707, 5309)));

        final PhoneNumber x = new PhoneNumber(707, 0, 5309);
        System.out.println(x);
        System.out.println(x.clone());
    }
}
