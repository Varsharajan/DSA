class Solution {
    public int trap(int[] height) {
        int n = height.length-1;
        int leftMax = height[0], rightMax = height[n];
        int left =0, right =n-1,result =0;
        while(left<=right)
        {
            if(leftMax<rightMax)
            {
                if(height[left]>=leftMax)
                  leftMax = height[left];
                else
                  result+=leftMax-height[left];
                left++;
                
            }
            else
            {
                if(height[right]>=rightMax)
                    rightMax = height[right];
                else
                     result+=rightMax-height[right];
                right--;
                
            }
        }
        return result;
    }
}