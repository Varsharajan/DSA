class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums,target,true);
        int end = binarySearch(nums,target,false);
        return new int[]{start,end};
    }

    int binarySearch(int[] nums,int target,boolean firstPos)
    {
        int pos =-1;
        int start = 0, end = nums.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]==target)
            {
                pos = mid;
                if(firstPos)
                  end = mid-1;
                else
                  start = mid+1;
            }
            else if(nums[mid]>target)
               end = mid-1;
            else
              start= mid+1;
        }
        return pos;
    }
}