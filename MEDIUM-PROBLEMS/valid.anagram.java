/*
LeetCode 242: Valid Anagram

Problem Statement:
Given two strings s and t,
return true if t is an anagram of s, and false otherwise.

Example:
Input:
s = "anagram"
t = "nagaram"

Output:
true
*/

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Solution obj = new Solution();
        System.out.println("Output: " + obj.isAnagram(s, t));
    }
}