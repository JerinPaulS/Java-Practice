package main.string;

// Write a program to find the longest common prefix among an array of strings.
//https://leetcode.com/problems/longest-common-prefix/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        System.out.print("Enter the count of strings: ");
        String[] strs = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the string: ");
            strs[i] = br.readLine();
        }
        System.out.println("The longest common prefix is: " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs[0].length() == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            Character ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || ch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];

    }

}
