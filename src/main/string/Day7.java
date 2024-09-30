package main.string;

//Day 7: Write a program to remove all spaces from a string and count the number of words in the string.
// Write a program to remove all duplicate characters from a string without using any additional data structures.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the string to count for words: ");
        String s = br.readLine();
        System.out.println("Words in the string: " + countWords(s));

        System.out.print("Enter the string to check for duplicate characters: ");
        String s1 = br.readLine();
        System.out.println("String after removing duplicate characters: " + removeDuplicates(s1));

    }

    private static int countWords(String s) {
        String[] words = s.split("\\s+");
        return words.length;
    }

    private static String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        String res = "";

        for (int index=0; index<chars.length; index++) {
            char curr_char = chars[index];
            int j;
            boolean flag = true;
            for (j=0; j<chars.length; j++) {
                if (curr_char==chars[j] && index!=j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += curr_char;
            }
        }
        return res;
    }

}
