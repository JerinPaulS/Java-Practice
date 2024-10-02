package main.stream;

//What is a Stream in Java 8? How do you create a stream from an array or a list?

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Day15 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of elements: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = ArrayBuilder.createNumbers(count);
        Stream<Integer> numStream = nums.stream();

        numStream.forEach(System.out::println);

    }

}
