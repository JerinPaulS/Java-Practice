package main.stream;

//Write a program to find the first non-repeated character in a string using Streams.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class Day20 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the word: ");
        String s = br.readLine();

        Character res = s.chars()
                        .mapToObj(ch -> Character.toLowerCase((char) ch))
                        .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream().filter(entry -> entry.getValue() == 1)
                        .map(entry -> entry.getKey())
                        .findFirst().get();

        System.out.println("Result = " + res);
    }

}
