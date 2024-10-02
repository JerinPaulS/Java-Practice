package main.stream;

//Write a program to count the number of occurrences of each word in a list of strings using Streams.

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Day21 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of words: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<String> words = ArrayBuilder.createWords(count);
        System.out.println("Words are: " + words);

        words.stream()
                .collect(Collectors.groupingBy(word -> word, HashMap::new, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);

    }

}
