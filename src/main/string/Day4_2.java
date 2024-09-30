package main.string;

// Write a program to check if two strings are anagrams of each other.
//https://leetcode.com/problems/valid-anagram/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Day4_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first string: ");
        String s1 = br.readLine();

        System.out.print("Enter the second string: ");
        String s2 = br.readLine();

        System.out.println(isAnagram(s1, s2));

    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_freq = new HashMap<>();
        HashMap<Character, Integer> t_freq = new HashMap<>();

        for (char char_s:s.toCharArray()) {
            if (s_freq.containsKey(char_s)) {
                s_freq.put(char_s, s_freq.get(char_s) + 1);
            } else {
                s_freq.put(char_s, 1);
            }

        }

        for (char char_t:t.toCharArray()) {
            if (t_freq.containsKey(char_t)) {
                t_freq.put(char_t, t_freq.get(char_t) + 1);
            } else {
                t_freq.put(char_t, 1);
            }
        }

        return s_freq.equals(t_freq);

    }

}
