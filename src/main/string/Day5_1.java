package main.string;

//Day 5: How do you convert a string to uppercase and lowercase in Java? Write a program to count the number of vowels and consonants in a string.

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Day5_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the string: ");
        String s = br.readLine();

        int[] count = countVowelsAndConsonants(s);
        System.out.println(String.format("The string has %s vowels and %s consonants", count[0], count[1]));
    }

    public static int[] countVowelsAndConsonants(String s) {
        int vowel = 0;
        int consonant = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowel += 1;
            } else if (isConsonant(ch)) {
                consonant += 1;
            }
        }
        return new int[]{vowel, consonant};
    }

    private static boolean isVowel(Character ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static boolean isConsonant(Character ch) {
        return ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k'
                || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's'
                || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z';
    }

}
