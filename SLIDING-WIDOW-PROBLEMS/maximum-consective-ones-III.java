/*maximum consective ones-III
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 
 */
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int zero=0;
        int l=0;
       
        //dynamic sliding window;
        //trick LENGTH OF A SUBARRAY =r-l+1
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zero++;

            }
            if(zero<=k){
                int len=r-l+1;
                max=Math.max(max,len);
            }
            while(zero>k){
                
                if(nums[l]==0){
                    zero--;
                }
                l++;
   

            }
  
        }
        return max;
        
    }
}