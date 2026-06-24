/*
LeetCode 283: Move Zeroes

Problem Statement:
Given an integer array nums, move all 0's to the end of it while
maintaining the relative order of the non-zero elements.

Note:
You must do this in-place without making a copy of the array.

Example:
Input:
nums = [0,1,0,3,12]

Output:
[1,3,12,0,0]

Explanation:
All zeroes are moved to the end while preserving the order
of the non-zero elements.
*/

import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Solution obj = new Solution();
        obj.moveZeroes(nums);

        System.out.println("Output: " + Arrays.toString(nums));
    }
}