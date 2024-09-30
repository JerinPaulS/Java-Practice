package main.string;

//Day 6: What is the StringBuilder class in Java? Write a program to demonstrate the use of StringBuilder to concatenate strings.
// Write a program to count the occurrences of each character in a string and display the characters in order of their frequency.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        String s = br.readLine();

        System.out.println("Concat the string using string builder: " + concatStrings("Hello ", "World!"));

        charFreq(s);
    }

    private static String concatStrings(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        StringBuilder sc = sb1.append(sb2);
        return sc.toString();
    }

    private static void charFreq(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        List<Map.Entry<Character, Integer>> mapList = new ArrayList<>(charMap.entrySet());
        mapList.sort(Map.Entry.comparingByValue());
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Character, Integer> val : mapList) {
            sortedMap.put(val.getKey(), val.getValue());
        }

        System.out.println(sortedMap);

    }

}
