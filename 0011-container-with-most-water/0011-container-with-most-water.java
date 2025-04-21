class Solution {
    public int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        int left =0, right = height.length-1;
        while(left<right)
        {
            int capacity = (right-left)*Math.min(height[left],height[right]);
            if(capacity>result)
                result = capacity;
            if(height[left]<height[right])
              left++;
            else
            right--;

        }
        return result;
    }
}