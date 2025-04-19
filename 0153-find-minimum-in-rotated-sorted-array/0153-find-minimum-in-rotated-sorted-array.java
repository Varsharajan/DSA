class Solution {
    public int findMin(int[] nums) {
       int start =0, end = nums.length-1;
       if(nums[start]<nums[end])
         return  nums[start];
        int mid =0;
        while(start<=end)
        {
             mid = start+(end-start)/2;
            if(nums[mid]<nums[end])
            {
                end = mid;
            }
            else
            start = mid+1;
        } 
        return nums[mid];
    }
}