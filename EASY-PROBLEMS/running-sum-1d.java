/*
LeetCode 1480: Running Sum of 1D Array

Problem Statement:
Given an array nums.

Define runningSum[i] as the sum of all elements
from nums[0] to nums[i].

Return the running sum of nums.

Example:
Input:
nums = [1,2,3,4]

Output:
[1,3,6,10]
*/

import java.util.*;

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        Solution obj = new Solution();
        System.out.println("Output: " +
                Arrays.toString(obj.runningSum(nums)));
    }
}