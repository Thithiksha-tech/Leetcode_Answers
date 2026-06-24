/*
LeetCode 9: Palindrome Number

Problem Statement:
Given an integer x, return true if x is a palindrome,
and false otherwise.

An integer is a palindrome when it reads the same
forward and backward.

Example:
Input:
x = 121

Output:
true

Explanation:
121 reads the same from left to right and right to left.
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return original == reverse;
    }
}

public class Main {
    public static void main(String[] args) {
        int x = 121;

        Solution obj = new Solution();
        boolean result = obj.isPalindrome(x);

        System.out.println("Output: " + result);
    }
}