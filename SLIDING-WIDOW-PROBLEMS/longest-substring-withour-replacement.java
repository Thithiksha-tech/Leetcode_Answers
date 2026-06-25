/*3.Longest-Substring-without-replacement
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence
 and not a substring.
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                l=map.get(s.charAt(r))+1;
                }
                
            }
                
                int len=r-l+1;
                max=Math.max(len,max);
                map.put(s.charAt(r),r);
               
            
            r++;
        }
        return max;

    
        
    }
}
