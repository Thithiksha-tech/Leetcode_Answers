/*
LeetCode 26: Remove Duplicates from Sorted Array

Problem Statement:
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element
appears only once.

Return the number of unique elements.

Example:
Input:
nums = [1,1,2]

Output:
2

Explanation:
The unique elements are [1,2].
Therefore, the number of unique elements is 2.
*/

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        Solution obj = new Solution();
        int k = obj.removeDuplicates(nums);

        System.out.println("Output: " + k);

        System.out.print("Unique Elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}