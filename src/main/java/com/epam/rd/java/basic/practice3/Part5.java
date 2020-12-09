package com.epam.rd.java.basic.practice3;

public class Part5 {
    private static final Object[][] NUMBERS = { { 100, "C" }, { 90, "XC" }, { 50, "L" }, { 40, "XL" }, { 10, "X" },
            { 9, "IX" }, { 5, "V" }, { 4, "IV" }, { 1, "I" } };
    
    public static void main(String[] args) {
        System.out.println(roman2Decimal("LXXIX"));
        System.out.println(decimal2Roman(50));
    }

        public static String decimal2Roman(int decimal) {
        if (decimal > 100 || decimal < 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        for (Object[] n : NUMBERS) {
            while (decimal - (Integer) n[0] >= 0) {
                result.append((String) n[1]);
                decimal -= (Integer) n[0];
            }
        }
        return result.toString();
    }

    public static int roman2Decimal(String roman) {
        if (roman == null || roman.isEmpty()) {
            return 0;
        }

        int result = 0;
        for (Object[] n : NUMBERS) {
            while (roman.startsWith((String) n[1])) {
                result += (Integer) n[0];
                roman = roman.replaceFirst((String) n[1], "");
            }
        }
        return result;
    }
}
