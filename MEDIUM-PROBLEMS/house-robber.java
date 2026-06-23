/*
LeetCode 198: House Robber

Problem Statement:
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed.

You cannot rob two adjacent houses.

Return the maximum amount of money you can rob without alerting the police.

Example:
Input:
nums = [2,7,9,3,1]

Output:
12

Explanation:
Rob house 1 (2), house 3 (9), and house 5 (1).
Total = 12.
*/

class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for(int num : nums) {
            int temp = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = temp;
        }

        return prev1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};

        Solution obj = new Solution();
        int result = obj.rob(nums);

        System.out.println("Output: " + result);
    }
}