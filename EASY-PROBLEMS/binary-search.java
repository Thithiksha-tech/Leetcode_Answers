/*
LeetCode 704: Binary Search

Problem Statement:
Given an array of integers nums which is sorted in ascending order,
and an integer target, return the index of target if it is present in the array.
Otherwise, return -1.

Example:
Input:
nums = [-1,0,3,5,9,12]
target = 9

Output:
4

Explanation:
The target value 9 exists in the array at index 4.
*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        Solution obj = new Solution();
        int result = obj.search(nums, target);

        System.out.println("Output: " + result);
    }
}