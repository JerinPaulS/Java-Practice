package main.array;

//Write a program to find the largest and smallest elements in an array. Write a program to find the sub-array with the maximum sum (Kadane's Algorithm).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;

public class Day9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of elements: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = ArrayBuilder.createNumbers(count);
        System.out.println(nums);

        fetchMaxMin(nums);
        System.out.println("Maximum sub-array sum = " + maxSubarray(nums));
    }

    private static void fetchMaxMin(ArrayList<Integer> nums) {
        int max_val = Integer.MIN_VALUE;
        int min_val = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min_val) {
                min_val = num;
            }
            if (num > max_val) {
                max_val = num;
            }
        }
        System.out.println("The max value is = " + max_val);
        System.out.println("The min value is = " + min_val);
    }

    private static int maxSubarray(ArrayList<Integer> nums) {
        int res = nums.get(0);
        int maxSum = nums.get(0);

        for (int index=1; index<nums.size(); index++) {
            maxSum = Math.max(maxSum + nums.get(index), nums.get(index));
            res = Math.max(res, maxSum);
        }
        return res;
    }

}
