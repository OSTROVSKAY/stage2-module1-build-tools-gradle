package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        if(str == null) return false;
        return ((str.startsWith("0") && str.length() > 1) || !(str.startsWith("-") || str.equals("0") || str.startsWith(" ") || str.equals("") || str.equals(null) || str.equals("null")));

         //here magic will happen
    }
}
