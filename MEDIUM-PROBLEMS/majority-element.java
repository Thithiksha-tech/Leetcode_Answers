/*
LeetCode 169: Majority Element

Problem Statement:
Given an array nums of size n,
return the majority element.

The majority element is the element that appears
more than n / 2 times.

Example:
Input:
nums = [2,2,1,1,1,2,2]

Output:
2

Explanation:
2 appears 4 times, which is more than n/2.
*/

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int num : nums) {
            if(count == 0) {
                candidate = num;
            }

            if(num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        Solution obj = new Solution();
        int result = obj.majorityElement(nums);

        System.out.println("Output: " + result);
    }
}