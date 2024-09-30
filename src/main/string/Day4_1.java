package main.string;

//Day 4: How do you check if a string contains a specific substring in Java? Write a program to find the first occurrence of a substring in a string.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day4_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the text: ");
        String text = br.readLine();
        System.out.print("Enter the substring: ");
        String substring = br.readLine();

        System.out.println(findFirstOccurrenceExisting(text, substring));
        System.out.println(findFirstOccurrence(text, substring));
    }

    private static int findFirstOccurrenceExisting(String text, String substring) {
        return text.indexOf(substring);
    }

    public static int findFirstOccurrence(String text, String substring) {
        if (text == null || substring == null || text.length() < substring.length()) {
            return -1;
        }
        int size = substring.length();
        for (int index = 0; index + size < text.length() + 1; index++) {
            if (text.substring(index, index + size).equals(substring)) {
                return index;
            }
        }
        return -1;
    }

}
