5. Longest Palindromic Substring


Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


code:
class Solution {
    public static int expand(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=expand(s,i,i); /*even index*/
            int len2=expand(s,i,i+1); /*odd index*/
            int len=Math.max(len1,len2);
            if(len>end-start+1){
                start=i-(len-1)/2;
                end=i+len/2;

            }
            
        }
        return s.substring(start,end+1);
        
    }
}