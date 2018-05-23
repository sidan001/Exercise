package com.exercise.essential_classes.regular_expressions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexNum {
    public static void main(String[] args) {
        final Pattern pattern = Pattern.compile("\\d+$");
        final String input = "productId=642566-D9";
        final Matcher matcher = pattern.matcher(input);
        System.out.println("matches: "+matcher.matches());
        System.out.println("lookingAt: "+matcher.lookingAt());
        System.out.println("find: "+matcher.find());
        System.out.println(matcher.group());
        System.out.println(matcher.start());
        System.out.println(input.substring(0, matcher.start()-2));

        final boolean matches = Pattern.matches("^\\d+(,\\d+)*,?$", "1,2,12,23,14");
        System.out.println(matches);


    }
}
