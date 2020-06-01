package org.example.Strings;

import java.util.Arrays;

public class Ex8Strings {
    public static void main(String[] args) {
        String string = "Oil and Water";
        String[] string1 = string.replace("and ", "").split(" ", 2);
        System.out.println(Arrays.toString(string1));
    }
}
