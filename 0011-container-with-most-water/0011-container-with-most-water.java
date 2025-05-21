import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int left=0,right = height.length-1;
        int length = 0,width =0;
        int highestArea = 0;
        int area = length * width;
       while(left < right) {
            width = right - left;
            length = Math.min(height[left], height[right]);
            area = width * length;
            highestArea = Math.max(highestArea, area);
            if (height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
        }
        return highestArea;

    }
}