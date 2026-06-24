/*
LeetCode 215: Kth Largest Element in an Array

Problem Statement:
Given an integer array nums and an integer k,
return the kth largest element in the array.

Example:
Input:
nums = [3,2,1,5,6,4]
k = 2

Output:
5

Explanation:
The 2nd largest element is 5.
*/

import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums) {
            pq.offer(num);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        Solution obj = new Solution();
        int result = obj.findKthLargest(nums, k);

        System.out.println("Output: " + result);
    }
}