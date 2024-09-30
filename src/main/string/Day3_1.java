package main.string;

//Day 3: How do you find the length of a string in Java?
// Write a program to reverse a string.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        String s = br.readLine();

        // String
        System.out.println(stringReverse(s));

        //StringBuilder
        System.out.println(stringBuilderReverse(new StringBuilder(s)));

        //StringBuffer
        System.out.println(stringBufferReverse(new StringBuffer(s)));
    }

    private static String stringReverse(String s) {
        String res = "";
        for (int index = s.length() - 1; index >= 0; index--) {
            res += s.charAt(index);
        }
        return res;
    }

    private static String stringBuilderReverse(StringBuilder s) {
        return s.reverse().toString();
    }

    private static String stringBufferReverse(StringBuffer s) {
        return s.reverse().toString();
    }

}
