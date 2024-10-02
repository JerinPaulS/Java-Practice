package main.stream;

//Write a program to find the sum of all elements in an array using Java Streams.

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Day17 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of elements: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = ArrayBuilder.createNumbers(count);
        System.out.println("Original array:" + nums);

        Stream<Integer> numStream = nums.stream();

        int sum = numStream.mapToInt(num -> num)
                .sum();
        System.out.println("Sum of all elements in the array = " + sum);
    }

}
