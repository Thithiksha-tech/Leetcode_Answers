11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the containe

code:
class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int l=0;
        int h=height.length-1;
        int max=0;
        while(l<h){
            int w=(h-l)*Math.min(height[l],height[h]);
            max=Math.max(max,w);
            if(height[l]<height[h]){
                l++;
            }
            else {
                h--;

            }
            

        }
        return max;
    }
}