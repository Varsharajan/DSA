class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            
         if((mid == 0 || nums[mid] != nums[mid - 1]) && 
            (mid == nums.length - 1 || nums[mid] != nums[mid + 1]))
              return nums[mid];
            else if(nums[mid]==nums[mid-1])
            {
                if((mid-2+start+1)%2==0)
                    start= mid+1;
                else
                    end = mid-2;
            }
            else if(nums[mid]==nums[mid+1])
            {
                 if((end-mid+2+1)%2==0)
                 {
                    end = mid-1;
                 }
                 else
                    start= mid+2;
            }
        }
        return -1;
    }
}