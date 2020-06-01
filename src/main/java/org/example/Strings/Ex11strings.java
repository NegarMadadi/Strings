package org.example.Strings;

public class Ex11strings {
    public static void main(String[] args) {
        char[] convert =  {'J','a','v','a'};
        String converted = new String(convert);
        String converted1 = String.valueOf(convert);

        System.out.println(converted);
        System.out.println(converted1);
    }
}
