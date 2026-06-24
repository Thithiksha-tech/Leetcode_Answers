/*
LeetCode 20: Valid Parentheses

Problem Statement:
Given a string s containing just the characters
'(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

Example:
Input:
s = "()[]{}"

Output:
true
*/

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "()[]{}";

        Solution obj = new Solution();
        System.out.println("Output: " + obj.isValid(s));
    }
}