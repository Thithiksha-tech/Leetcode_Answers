/*
LeetCode 189: Rotate Array

Problem Statement:
Given an integer array nums, rotate the array to the right by k steps.

Example:
Input:
nums = [1,2,3,4,5,6,7]
k = 3

Output:
[5,6,7,1,2,3,4]
*/

import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        Solution obj = new Solution();
        obj.rotate(nums, k);

        System.out.println("Output: " + Arrays.toString(nums));
    }
}