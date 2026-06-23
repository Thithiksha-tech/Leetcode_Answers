/*
LeetCode 27: Remove Element

Problem Statement:
Given an integer array nums and an integer val, remove all occurrences
of val in nums in-place. The order of the elements may be changed.
Return the number of elements that are not equal to val.

Example:
Input:
nums = [3,2,2,3]
val = 3

Output:
2

Explanation:
After removing 3, the remaining elements are [2,2].
Therefore, the count of elements not equal to val is 2.
*/

import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution obj = new Solution();
        int k = obj.removeElement(nums, val);

        System.out.println("Output: " + k);

        System.out.print("Remaining Elements: ");
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}