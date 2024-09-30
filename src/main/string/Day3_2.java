package main.string;

//Day 3: How do you find the length of a string in Java?
// Write a program to find all permutations of a given string.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day3_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        String s = br.readLine();
        System.out.println("The longest substring is " + getPermutations(s));
    }

    public static List<String> getPermutations(String s) {
        List<String> res = new ArrayList<>();
        permute(s.toCharArray(), 0, res);
        return res;
    }

    private static void permute(char[] chars, int index, List<String> res) {
        if (index == chars.length - 1) {
            res.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1, res);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
