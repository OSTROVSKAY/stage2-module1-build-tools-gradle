package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here

        boolean x = false;

        if(args.contains(null) || args == null) {

            x = false;

        } else {

            int count = 0;

            for(String str: args) {

                if(str.startsWith("-") || str.equals("0") || str.startsWith(" ") || str.equals("")) {

                    count++;
                }

            }

            if(count == 0) {

                x = true;
            }

        }

        return x;

    }
}