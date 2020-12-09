package com.epam.rd.java.basic.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
    private static final Pattern LOGIN_NAME_EMAIL = Pattern
            .compile("(([a-z\\u0410-\\u044F]+);([\\w\\u0410-\\u044F]+\\s[\\w\\u0410-\\u044F]+);(\\w+@(\\w+.\\w+)))", Pattern.MULTILINE);

    public static void main(String[] args) {
        String part1 = Util.getInput("part1.txt");
        System.out.println(part1);
        System.out.println();
        System.out.println(convert4(part1));
    }

    public static String convert1(String input) {
        if (input != null) {
            StringBuilder result = new StringBuilder();
            Pattern pattern = Pattern.compile(
                    "((?<=\\s)([a-zа-я]+(?=;))|(?<=;)([^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+))",
                    Pattern.UNICODE_CHARACTER_CLASS);

            Matcher matcher = pattern.matcher(input);
            int count = 1;
            while (matcher.find()) {
                count++;
                if (count % 2 == 0) {
                    result.append(input, matcher.start(), matcher.end()).append(": ");
                } else {
                    result.append(input, matcher.start(), matcher.end()).append("\n");
                }
            }
            return result.toString();
        }
        return null;
    }

    public static String convert2(String input) {
        if (input == null) {
            return null;
        }
        String[] strToArr = input.replace("\n", ";").split(";");
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i <= strToArr.length - 3; i += 3) {
            sb.append(strToArr[i + 1].substring(strToArr[i + 1].indexOf(' ') + 1))
                    .append(" ")
                    .append(strToArr[i + 1], 0, strToArr[i + 1].indexOf(' '))
                    .append(" (email: ")
                    .append(strToArr[i + 2])
                    .append(")\n");
        }
        return sb.toString();
    }

    public static String convert3(String input) {
        if (input != null) {
            String result = "";
            for (String str : input.replaceFirst(".*?\n", "").split("\n")) {
                String login = str.split(";")[0];
                String domain = str.replaceFirst(".*@", "");
                result = result.contains(domain) ? result.replaceFirst(domain + ".*?(?=\n)", "$0, " + login)
                        : String.format("%s%s ==> %s%n", result, domain, login);
            }
            return result;
        }
        return null;
    }

    public static String convert4(String input) {
        Matcher matcher = LOGIN_NAME_EMAIL.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "$1;" + 1488);
        }
        return sb.toString();
    }
}