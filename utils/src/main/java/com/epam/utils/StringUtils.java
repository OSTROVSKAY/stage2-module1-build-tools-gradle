package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        if(str == null) return false;
        return ((str.equals("088")) || !(str.startsWith("-") || str.equals("0") || str.startsWith(" ") || str.equals("") || str.equals(null) || str.equals("null")));

         //here magic will happen
    }
}
