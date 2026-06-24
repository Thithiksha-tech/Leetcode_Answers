/*
LeetCode 88: Merge Sorted Array

Problem Statement:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums2 into nums1 as one sorted array.

The final sorted array should not be returned by the function, but instead be stored inside nums1.
nums1 has a length of m + n, where the last n elements are set to 0 and should be ignored.

Example:
Input:
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3

Output:
[1,2,2,3,5,6]

Explanation:
After merging nums2 into nums1, the sorted array becomes [1,2,2,3,5,6].
*/

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution obj = new Solution();
        obj.merge(nums1, m, nums2, n);

        System.out.println("Output: " + Arrays.toString(nums1));
    }
}