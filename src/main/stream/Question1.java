package main.stream;

//Question: Given a list of sentences, write a program to split each sentence into words and flatten the result into a single list of words using Java Streams.
//Example:
//List<String> sentences = Arrays.asList("Java is great", "Streams are powerful");
// Expected output: [Java, is, great, Streams, are, powerful]

import main.array.ArrayBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of sentences: ");
        int count = Integer.parseInt(br.readLine());

        List<String> sentences = ArrayBuilder.sentences(count);
        System.out.println("The sentences are: " + sentences);
        System.out.println("List of words = " + getWords(sentences));

    }

    private static List<String> getWords(List<String> sentences) {
        List<String> res = sentences.stream()
                                .flatMap(sentence -> Arrays.stream(sentence.split("\\s")))
                                .collect(Collectors.toList());
        return res;
    }

}
