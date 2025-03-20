class Solution {
    public int trap(int[] height) {
        int n = height.length-1;
        int result = 0;
        int left =0, right=n;
        int leftBar =height[0], rightBar = height[n];
        while(left<right)
        {
            if(leftBar<rightBar)
            {
                if(height[left]>leftBar)
                    leftBar= height[left];
                else
                {
                   result+=leftBar-height[left];
                   left++;
                }
            }
            else
            {
                if(height[right]>rightBar)
                   rightBar=height[right];
                else
                {
                   result+=rightBar-height[right];
                   right--;
                }
            }
        }
        return result;
    }
}