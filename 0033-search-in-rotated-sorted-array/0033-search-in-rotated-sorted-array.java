class Solution {
    public int search(int[] nums, int target) {
      int start =0, end= nums.length-1,result =-1;
      while(start<=end)
      {
        int mid = start+(end-start)/2;
        if(target==nums[mid])
           return mid;
        else if(nums[start]<=nums[mid])  // left sorted
           {
              if(nums[start]<=target && target<nums[mid])
                 end = mid-1;
               else
                 start = mid+1;
           }
           else
            {
                if(nums[mid]<target && target<=nums[end])
                   start = mid+1;
                else
                   end = mid-1;
            }
      }
          return -1;
    }
}