/*
LeetCode 136: Single Number

Problem Statement:
Given a non-empty array of integers nums,
every element appears twice except for one.

Find that single one.

Example:
Input:
nums = [4,1,2,1,2]

Output:
4
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int num : nums) {
            result ^= num;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        Solution obj = new Solution();
        System.out.println("Output: " + obj.singleNumber(nums));
    }
}