/*
LeetCode 739: Daily Temperatures

Problem Statement:
Given an array of integers temperatures representing daily temperatures,
return an array answer such that answer[i] is the number of days you have
to wait after the ith day to get a warmer temperature.

If there is no future day for which this is possible, keep answer[i] = 0.

Example:
Input:
temperatures = [73,74,75,71,69,72,76,73]

Output:
[1,1,4,2,1,1,0,0]
*/

import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();
                answer[index] = i - index;
            }

            stack.push(i);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};

        Solution obj = new Solution();
        int[] result = obj.dailyTemperatures(temperatures);

        System.out.println("Output: " + Arrays.toString(result));
    }
}