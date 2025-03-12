class Solution {
//TC = O(N^3) SC =O(1)
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> result;
        int low =0, high=0;
        long long sum =0;
        int n = nums.size();
        for(int i =0;i<n-3;i++)
        {
            for(int j =i+1;j<n-2;j++)
            {
                 low =j+1;
                 high =n-1;
                 sum = (long long)target -(long long)(nums[i]+nums[j]);
                 while(low<high)
                 {
                     if(nums[low]+nums[high]==sum)
                     {
                         result.push_back({nums[i],nums[j],nums[low],nums[high]});
                         while(low<high && nums[low]==nums[low+1])
                          low++;
                         while(low<high && nums[high]==nums[high-1])
                          high--;
                         low++;
                         high--;
                     }
                     else if(nums[low]+nums[high]<sum)
                      low++;
                     else
                     high--;
                 }
                while(j<n-2 && nums[j]==nums[j+1])
                j++;

            }
             while(i<n-3 && nums[i]==nums[i+1])
                i++;
        }

        return result;


     }
};