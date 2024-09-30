//What is a String in Java? How do you create a string in Java? Write a program to check if a string is a palindrome (ignoring spaces and case).

package main.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the input string: ");
        String s = br.readLine();

        System.out.println("Checking with STRING");
        System.out.println(s + " is " + (checkStringPalindrome(s) ? "a" : "not a") + " PALINDROME.");

        System.out.println("Checking with STRING BUILDER");
        System.out.println(s + " is " + (checkStringBuilderPalindrome(new StringBuilder(s)) ? "a" : "not a") + " PALINDROME.");

        System.out.println("Checking with STRING BUFFER");
        System.out.println(s + " is " + (checkStringBufferPalindrome(new StringBuffer(s)) ? "a" : "not a") + " PALINDROME.");
    }

    private static Boolean checkStringPalindrome(String s) {
        String s_new = s.replace(" ", "");
        int start = 0;
        int end = s_new.length() - 1;

        while (start < end) {
            if (s_new.charAt(start) != s_new.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

    private static Boolean checkStringBuilderPalindrome(StringBuilder s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                s.deleteCharAt(i);
            }
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

    private static Boolean checkStringBufferPalindrome(StringBuffer s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                s.deleteCharAt(i);
            }
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

    public static Boolean isPalindrome(String str) {
        str = str.replace(" ", "");
        str = str.toLowerCase();
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                s.deleteCharAt(i);
            }
        }
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

}
