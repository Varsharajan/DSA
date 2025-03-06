class Solution {
    public int findMin(int[] nums) {
        int start =0,end = nums.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]) // move to right side
                start = mid+1;
            else
                end = mid; // move to left side
        }
        return nums[start];
    }
} // O(logn) O(1)