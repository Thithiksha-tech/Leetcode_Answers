/*
LeetCode 821: Shortest Distance to a Character

Problem Statement:
Given a string s and a character c,
return an array of integers where answer[i]
is the shortest distance from index i to character c.

Example:
Input:
s = "loveleetcode"
c = 'e'

Output:
[3,2,1,0,1,0,0,1,2,2,1,0]

Explanation:
For each index, calculate the minimum distance
to the nearest occurrence of 'e'.
*/

import java.util.*;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];

        int prev = -n;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }

        prev = 2 * n;

        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';

        Solution obj = new Solution();
        int[] result = obj.shortestToChar(s, c);

        System.out.println("Output: " + Arrays.toString(result));
    }
}