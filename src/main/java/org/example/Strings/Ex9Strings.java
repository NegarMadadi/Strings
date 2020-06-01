package org.example.Strings;

import java.util.Arrays;

public class Ex9Strings {
    public static void main(String[] args) {
        String string = "Carl,Susie,Fredrick,Bob,Erik";
        String[] string1 = string.split(",");
        System.out.println(Arrays.toString(string1));

        for (int i = 0; i < string1.length; i++) {
            System.out.println(string1[i]);
        }
    }
}
