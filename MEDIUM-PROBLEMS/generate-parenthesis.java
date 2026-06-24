/*
LeetCode 22: Generate Parentheses

Problem Statement:
Given n pairs of parentheses,
write a function to generate all combinations
of well-formed parentheses.

Example:
Input:
n = 3

Output:
[((())), (()()), (())(), ()(()), ()()()]
*/

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current,
                           int open, int close, int n) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 3;

        Solution obj = new Solution();
        List<String> result = obj.generateParenthesis(n);

        System.out.println("Output: " + result);
    }
}