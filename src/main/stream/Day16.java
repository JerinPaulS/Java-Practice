package main.stream;

//Write a program to filter even numbers from an array using Java Streams.

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day16 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of elements: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = ArrayBuilder.createNumbers(count);
        Stream<Integer> numStream = nums.stream();

        System.out.println("Original Array: " + nums);
        System.out.print("Even numbers: ");
        numStream.filter(num -> num % 2 == 0)
                .forEach(System.out::println);

    }

}
