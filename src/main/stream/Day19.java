package main.stream;

//Write a program to sort a list of strings using Streams.

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Day19 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the count of array: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = ArrayBuilder.createNumbers(count);
        Stream<Integer> numStream = nums.stream();
        System.out.println("Original array: " + nums);

        System.out.println("Numbers after ascending sort: ");
        numStream.sorted().forEach(System.out::println);

        ArrayList<String> words = ArrayBuilder.createWords(count);
        Stream<String> wordStream = words.stream();
        System.out.println("Original array: " + words);

        System.out.println("Words after ascending sort: ");
        wordStream.sorted().forEach(System.out::println);

        ArrayList<Integer> nums1 = ArrayBuilder.createNumbers(count);
        Stream<Integer> numStream1 = nums1.stream();
        System.out.println("Original array: " + nums1);

        System.out.println("Numbers after descending sort: ");
        numStream1.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        ArrayList<String> words1 = ArrayBuilder.createWords(count);
        Stream<String> wordStream1 = words1.stream();
        System.out.println("Original array: " + words1);

        System.out.println("Words after descending sort: ");
        wordStream1.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
