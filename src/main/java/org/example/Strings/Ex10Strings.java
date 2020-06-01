package org.example.Strings;

import java.util.Arrays;

public class Ex10Strings {
    public static void main(String[] args) {
        String string = "ThisShouldBeConverted";
        char[] charArray = string.toCharArray();
        System.out.println(Arrays.toString(charArray));

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
