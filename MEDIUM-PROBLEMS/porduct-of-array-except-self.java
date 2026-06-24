/*
LeetCode 238: Product of Array Except Self

Problem Statement:
Given an integer array nums, return an array answer such that
answer[i] is equal to the product of all the elements of nums except nums[i].

Example:
Input:
nums = [1,2,3,4]

Output:
[24,12,8,6]
*/

import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;

        for(int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;

        for(int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        Solution obj = new Solution();
        System.out.println("Output: " +
                Arrays.toString(obj.productExceptSelf(nums)));
    }
}