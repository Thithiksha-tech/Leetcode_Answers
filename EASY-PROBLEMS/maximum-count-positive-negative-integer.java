/*
LeetCode 2529: Maximum Count of Positive Integer and Negative Integer

Problem Statement:
Given an array nums sorted in non-decreasing order, return the maximum
between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers is pos and the number
of negative integers is neg, return max(pos, neg).

Note: 0 is neither positive nor negative.

Example:
Input:
nums = [-2,-1,-1,1,2,3]

Output:
3

Explanation:
Negative integers = 3
Positive integers = 3

Maximum count = 3
*/

class Solution {
    public int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;

        for(int num : nums) {
            if(num > 0) {
                positive++;
            }
            else if(num < 0) {
                negative++;
            }
        }

        return Math.max(positive, negative);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};

        Solution obj = new Solution();
        int result = obj.maximumCount(nums);

        System.out.println("Output: " + result);
    }
}