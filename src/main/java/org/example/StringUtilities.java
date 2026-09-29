package org.example;

public class StringUtilities {
    public static boolean shortString(String str) {
        if (str.length() < 5) {
            return true;
        }
        return false;
    }

    public static char firstLetter(String str) {
        return str.charAt(0);
    }

    public static String censorAsparagus(String str) {
        return str.replace("asparagus", "****");
    }

    public static String bigger(String a, String b) {
        if (a.length() >= b.length()) {
            return a;
        }
        return b;
    }
}
