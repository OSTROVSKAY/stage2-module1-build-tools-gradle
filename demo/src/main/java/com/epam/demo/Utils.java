package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here

        if (args.contains(null) || args == null) return false;

        for(String str: args){
            if (str.startsWith("-") || str.equals("0") || str.startsWith(" ") || str.equals("") || str == null ) return false;

        }
        return true;
    }
}