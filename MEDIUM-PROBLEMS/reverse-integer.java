/*
LeetCode 7: Reverse Integer

Problem Statement:
Given a signed 32-bit integer x,
return x with its digits reversed.

If reversing x causes the value to go outside the
signed 32-bit integer range, return 0.

Example:
Input:
x = 123

Output:
321
*/

class Solution {
    public int reverse(int x) {
        int result = 0;

        while(x != 0) {
            int digit = x % 10;

            if(result > Integer.MAX_VALUE / 10 ||
               result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result = result * 10 + digit;
            x /= 10;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int x = 123;

        Solution obj = new Solution();
        System.out.println("Output: " + obj.reverse(x));
    }
}