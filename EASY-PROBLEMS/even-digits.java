/*
LeetCode 1295: Find Numbers with Even Number of Digits

Problem Statement:
Given an array nums of integers, return how many of them contain
an even number of digits.

Example:
Input:
nums = [12,345,2,6,7896]

Output:
2

Explanation:
12 contains 2 digits (even)
345 contains 3 digits (odd)
2 contains 1 digit (odd)
6 contains 1 digit (odd)
7896 contains 4 digits (even)

Therefore, there are 2 numbers with an even number of digits.
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums) {
            int digits = 0;
            int n = num;

            while(n > 0) {
                digits++;
                n /= 10;
            }

            if(digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        Solution obj = new Solution();
        int result = obj.findNumbers(nums);

        System.out.println("Output: " + result);
    }
}