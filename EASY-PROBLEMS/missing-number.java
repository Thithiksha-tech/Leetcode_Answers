/*
LeetCode 268: Missing Number

Problem Statement:
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example:
Input:
nums = [3,0,1]

Output:
2

Explanation:
n = 3, so the numbers should be [0,1,2,3].
Since 2 is missing, the output is 2.
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        Solution obj = new Solution();
        int result = obj.missingNumber(nums);

        System.out.println("Output: " + result);
    }
}