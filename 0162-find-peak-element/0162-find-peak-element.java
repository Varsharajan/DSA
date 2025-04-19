class Solution {
    public int findPeakElement(int[] nums) {
       int start =0, end = nums.length-1;
       int n = nums.length;
       if(n==1)
         return 0;
       if(n>=2 && nums[start]>nums[start+1])
         return 0;
       if(n>=2 && nums[end]>nums[end-1])
        return end;
       while(start<=end)
       {
          int mid = start+(end-start)/2;
          if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
             return mid;
          else if(nums[mid]<nums[mid+1])
            start = mid;
          else
            end = mid;
       }
       return -1;
    }
}