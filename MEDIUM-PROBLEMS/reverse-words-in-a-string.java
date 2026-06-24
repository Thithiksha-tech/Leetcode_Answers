/*
LeetCode 151: Reverse Words in a String

Problem Statement:
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space.

Example:
Input:
s = "the sky is blue"

Output:
"blue is sky the"
*/

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if(i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "the sky is blue";

        Solution obj = new Solution();
        System.out.println("Output: " + obj.reverseWords(s));
    }
}