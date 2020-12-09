package com.epam.rd.java.basic.practice3;

public class Part2 {

    public static void main(String[] args) {
        String text2 = Util.getInput("part2.txt");
        System.out.println(text2);
        System.out.println();
        System.out.println(convert(text2));
    }

    public static String convert(String input) {
        String[] words = input.split("(?U)\\W");
        int maxLength = words[0].length();
        int minLength = words[0].length();
        for(int i = 1; i < words.length; i++) {
            if(words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
            if(words[i].length() < minLength && words[i].length() > 0) {
                minLength = words[i].length();
            }
        }

        return "Min: " + getWords(minLength, words) +
                System.lineSeparator() + "Max: " +
                getWords(maxLength, words);
    }

    private static String getWords(int wordLength, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() == wordLength && !sb.toString().contains(word)) {
                sb.append(word);
                sb.append(", ");
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}