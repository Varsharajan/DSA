class Solution {
    public int findPeakElement(int[] nums) {
       int n = nums.length;
       if(n==1)
         return 0;
       if( nums[0]>nums[1])
         return 0;
       if(nums[n-1]>nums[n-2])
        return n-1;
        int start =0, end = n-1;
       while(start<end)
       {
          int mid = start+(end-start)/2;
          if(mid >0 && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
             return mid;
          else if(mid<n-1 &&nums[mid]<nums[mid+1])
            start = mid+1;
          else
            end = mid-1;
       }
       return -1;
    }
}