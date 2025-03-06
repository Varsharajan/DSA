class Solution {
// TC =O(logn) SC =O(1)
public:
    int findPeakElement(vector<int>& nums) {
        int n = nums.size()-1;
        if(n ==0)   // single element
        return 0;
        // base cases , if first and last element is strictly higher
        if(nums[0]>nums[1])
         return 0;
        if(nums[n]>nums[n-1])
        return n;
        int start=1;
        int end= nums.size()-2;
        int ans =0;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid-1]<nums[mid]&& nums[mid]>nums[mid+1]) // if mid is peak
            {
                ans = mid;
                break;
            }
            else if(nums[mid]<nums[mid+1])
                start = mid+1; // moves right 
            else // moves left
                end = mid-1;
            
        }
        return ans;

    }
};