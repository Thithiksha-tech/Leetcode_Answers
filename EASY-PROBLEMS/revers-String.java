/*
LeetCode 344: Reverse String

Problem Statement:
Write a function that reverses a string.
The input string is given as an array of characters s.

You must do this by modifying the input array in-place.

Example:
Input:
s = ['h','e','l','l','o']

Output:
['o','l','l','e','h']

Explanation:
The string is reversed in-place.
*/

import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        Solution obj = new Solution();
        obj.reverseString(s);

        System.out.println("Output: " + Arrays.toString(s));
    }
}