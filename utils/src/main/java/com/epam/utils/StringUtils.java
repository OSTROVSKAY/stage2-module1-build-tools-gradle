package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        boolean x = false;

        if(str == null) {

            x = false;

        } else if (!str.startsWith("-") || !str.equals("0") || !str.startsWith(" ") || !str.equals(""))  {

            x = true;

        }

        return x;

         //here magic will happen
    }
}
