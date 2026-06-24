125. Valid Palindrome

 phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.


code:
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res.append(Character.toLowerCase(s.charAt(i)));
            }
        }
       
        int l=0;
        int h=res.length()-1;
        while(l<h){
            if(res.charAt(l)!=res.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
        
    }
}
