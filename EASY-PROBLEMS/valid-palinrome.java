/*
LeetCode 125: Valid Palindrome

Problem Statement:
A phrase is a palindrome if, after converting all uppercase letters
into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward.

Return true if the phrase is a palindrome, or false otherwise.

Example:
Input:
s = "A man, a plan, a canal: Panama"

Output:
true

Explanation:
After removing spaces and punctuation and converting to lowercase,
the string becomes "amanaplanacanalpanama", which is a palindrome.
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        Solution obj = new Solution();
        boolean result = obj.isPalindrome(s);

        System.out.println("Output: " + result);
    }
}