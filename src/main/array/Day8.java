package main.array;

//What is an array in Java? How do you declare and initialize an array? Write a program to find the maximum product of two integers in an array.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Day8 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of numbers: ");
        int size = Integer.parseInt(br.readLine());

        int[] nums = new int[size];
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int count=0; count<size; count++) {
            System.out.print("Enter the " + (count + 1) + " value: ");
            int num = Integer.parseInt(br.readLine());
            nums[count] = num;
            numbers.add(num);
        }

        System.out.println("Max value from arrays: " + maxArrayProd(nums));
        System.out.println("Max value from arrays: " + maxArrayListProd(numbers));

    }

    private static int maxArrayProd(int[] nums) {
        int max1 = 0;
        int max2 = -1;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }

    private static int maxArrayListProd(ArrayList<Integer> nums) {
        int max1 = 0;
        int max2 = -1;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }

}
