/*
LeetCode 75: Sort Colors

Problem Statement:
Given an array nums with n objects colored red, white, or blue,
sort them in-place so that objects of the same color are adjacent.

We use the integers 0, 1, and 2 to represent the colors red, white, and blue.

Example:
Input:
nums = [2,0,2,1,1,0]

Output:
[0,0,1,1,2,2]
*/

import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        Solution obj = new Solution();
        obj.sortColors(nums);

        System.out.println("Output: " + Arrays.toString(nums));
    }
}