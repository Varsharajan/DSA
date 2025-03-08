class Solution {
// TC =O(log n)  SC =O(1)
public:
    int findMin(vector<int>& nums) {
        int minVal = INT_MAX;
        int start =0;
        int end = nums.size()-1;
        while(start<=end)
        {
            if(nums[start]<nums[end]) // if arrray is sorted already n times || if we are in sorted part , consider first element itself as small
            {
                minVal = min(nums[start],minVal);
                break;
            }
            int mid = start+(end-start)/2;
            minVal = min(nums[mid],minVal);
            if(nums[start]<=nums[mid]) // if array is left sorted , consider right part
               start = mid+1;
            else // if array is right sorted , consider left part
              end = mid-1;
        }
        return minVal;
    }
};