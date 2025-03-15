class Solution {
    public int findPeakElement(int[] nums) {
        int start =0, end = nums.length-1;
        if(nums.length<2)
          return 0;
        if(nums[0]>nums[1])
           return 0;
        if(nums[end]>nums[end-1])
          return end;
        while(start<=end)
        {
            int mid = start+(end-start)/2;  
            if(mid>0 && nums[mid]>nums[mid-1] &&
                 nums[mid]>nums[mid+1])
               return mid;
            else if(mid<nums.length-1 && nums[mid+1]>nums[mid])
              start = mid+1;
            else
              end = mid-1;
        }
        return -1;
    }
}