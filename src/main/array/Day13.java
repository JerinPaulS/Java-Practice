package main.array;

//Write a program to remove duplicate elements from an array. Write a program to find the missing number in an array of size n containing numbers from 1 to n.
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//https://leetcode.com/problems/missing-number/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day13 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the count of elements: ");
        int count = Integer.parseInt(br.readLine());
        int[] nums = ArrayBuilder.createNumberArray(count);

        System.out.println("Original Array: ");
        ArrayBuilder.display(nums);

        System.out.println("The array after removing duplicates: ");
        ArrayBuilder.display(nums, removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;

        for (int curr=1; curr<nums.length; curr++) {
            if (nums[index] != nums[curr]) {
                index++;
                nums[index] = nums[curr];
            }
        }
        return index + 1;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        int val = (n * (n + 1)) / 2;
        return val - sum;
    }

}
