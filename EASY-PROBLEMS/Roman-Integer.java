/*
LeetCode 13: Roman to Integer

Problem Statement:
Given a Roman numeral, convert it to an integer.

Example:
Input:
s = "III"

Output:
3

Explanation:
III = 3
*/

import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 &&
               map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        Solution obj = new Solution();
        int result = obj.romanToInt(s);

        System.out.println("Output: " + result);
    }
}