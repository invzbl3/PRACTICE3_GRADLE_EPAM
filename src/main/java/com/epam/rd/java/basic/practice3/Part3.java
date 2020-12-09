package com.epam.rd.java.basic.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {
    public static void main(String[] args) {
        String text3 = Util.getInput("part3.txt");
        System.out.println(text3);
        System.out.println();
        System.out.println(convert(text3));
    }

    public static String convert(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        Pattern pattern = Pattern.compile("\\b\\p{L}{3}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            char firstChar = stringBuilder.charAt(matcher.start());
            if (Character.isUpperCase(firstChar)) {
                stringBuilder.setCharAt(matcher.start(), Character.toLowerCase(firstChar));
            } else {
                stringBuilder.setCharAt(matcher.start(), Character.toUpperCase(firstChar));
            }
        }
        return stringBuilder.toString();
    }
}
