package main.stream;

//Write a program to convert all strings in a list to uppercase using Streams.

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Day18 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the count of words: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<String> words = ArrayBuilder.createWords(count);
        Stream<String> wordStream = words.stream();
        System.out.println("Original array: " + words);

        wordStream.map(String::toUpperCase).forEach(System.out::println);

    }

}
