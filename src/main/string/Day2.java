package main.string;

//Day 2: How do you compare two strings in Java? What is the difference between == and .equals() for comparing strings? Write a program to find the longest substring
// without repeating characters.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class Day2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        String s = br.readLine();
        System.out.println("The longest substring is " + getLongestSubstring(s));
    }

    public static Integer getLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
