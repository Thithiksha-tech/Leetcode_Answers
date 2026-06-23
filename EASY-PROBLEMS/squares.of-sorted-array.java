/*
LeetCode 977: Squares of a Sorted Array

Problem Statement:
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.

Example:
Input:
nums = [-4,-1,0,3,10]

Output:
[0,1,9,16,100]
*/

import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for(int i = n - 1; i >= 0; i--) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        Solution obj = new Solution();
        System.out.println("Output: " +
                Arrays.toString(obj.sortedSquares(nums)));
    }
}