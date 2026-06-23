/*
LeetCode 2798: Number of Employees Who Met the Target

Problem Statement:
There are n employees in a company, where the number of hours worked by
the ith employee is represented by hours[i].

You are also given an integer target.

Return the number of employees who worked at least target hours.

Example:
Input:
hours = [0,1,2,3,4]
target = 2

Output:
3

Explanation:
Employees with 2, 3, and 4 hours met the target.
So the answer is 3.
*/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;

        Solution obj = new Solution();
        int result = obj.numberOfEmployeesWhoMetTarget(hours, target);

        System.out.println("Output: " + result);
    }
}