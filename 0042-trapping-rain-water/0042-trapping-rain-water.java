class Solution {
    public int trap(int[] height) {
        int n = height.length-1,ans=0;
        int left =0, right = n;
        int leftBar = height[0], rightBar = height[n];
        while(left<right)
        {
            if(leftBar < rightBar)
            {
                if(height[left]>leftBar)
                   leftBar = height[left];
                else
                {
                  ans+=leftBar-height[left];
                  left++;
                }

            }
            else
            {
                if(height[right]>rightBar)
                    rightBar = height[right];
                else
                {
                   ans+=rightBar-height[right];
                   right--;
                }
            }
        }
        return ans;
    }
}