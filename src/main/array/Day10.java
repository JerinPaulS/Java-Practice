package main.array;

//Write a program to reverse an array in Java. Write a program to rotate a matrix (2D array) by 90 degrees in place.
// https://leetcode.com/problems/rotate-image/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Day10 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of elements: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<Character> chars = ArrayBuilder.createCharacters(count);
        System.out.println("Original array: " + chars);
        System.out.println("Reverse of array: " + reverseArray(chars));

    }

    private static ArrayList<Character> reverseArray(ArrayList<Character> s) {
        int start = 0;
        int end = s.size() - 1;

        while (start < end) {
            char temp = s.get(start);
            s.set(start, s.get(end));
            s.set(end, temp);
            start++;
            end--;
        }
        return s;
    }

    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row=0; row<rows; row++) {
            for (int col=0; col<row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for (int row=0; row<rows; row++) {
            for (int col=0; col<cols*0.5; col++) {
                int temp = matrix[row][cols-col-1];
                matrix[row][cols-col-1] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }

    }

}
