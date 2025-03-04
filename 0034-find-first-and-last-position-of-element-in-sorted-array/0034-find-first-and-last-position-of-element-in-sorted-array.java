class Solution {
    public int[] searchRange(int[] nums, int target) {
       return new int[]{findIndex(nums,target,true),
        findIndex(nums,target,false)};

    }

    int findIndex(int[] nums, int target, boolean findFirst)
    {
        int start =0, end = nums.length-1,result =-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target==nums[mid])
            {
                result = mid;
                if(findFirst)
                   end= mid-1;
                else
                  start = mid+1;
            }
            else if(target<nums[mid])
               end = mid-1;
            else
               start = mid+1;
        }
        return result;
    }
} // TC =O(logn) SC =O(1)