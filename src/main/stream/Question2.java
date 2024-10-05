package main.stream;

//2. Grouping and Counting
//Question: Given a list of words, count the frequency of each word length using Java Streams.
//Example:
//List<String> words = Arrays.asList("hello", "world", "java", "streams");
// Expected output: {5=2, 4=1, 7=1}

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of words: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<String> words = ArrayBuilder.createWords(count);
        System.out.println("Original list of words: " + words);
        System.out.println("Frequency of word lengths = " + wordFrequency(words));

    }

    private static HashMap<Integer, Long> wordFrequency(ArrayList<String> words) {
        HashMap<Integer, Long> res = words.stream().
                                            map(word -> word.length()).
                                            collect(Collectors.groupingBy(wordLength -> wordLength, HashMap::new, Collectors.counting()));

        return res;
    }

}
