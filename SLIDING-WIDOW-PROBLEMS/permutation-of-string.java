/*567 Permutaion of string

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false

code:*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] init=new int[26];
        for(int i=0;i<s1.length();i++){
            init[s1.charAt(i)-'a']++;
            
        }
        int[] origin=new int[26];

        for(int i=0;i<s1.length();i++){
            origin[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(init,origin)){
            return true;
        }
        for(int i=s1.length();i<s2.length();i++){
            origin[s2.charAt(i)-'a']++;
            origin[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(init,origin)){
                return true;
            }
        }
        return false;
        
        
    }
}