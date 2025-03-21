class Solution {
    // TC -O(n*n)
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        int n  = nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<n;i++)
        {
            int a = nums[i];
            int t = -a;
            int s= i+1;
            int e = n-1;
            while(s<e)
            {
                if(nums[s]+nums[e]==t)
                {
                    result.push_back({nums[i],nums[s],nums[e]});
                    // to avoid second and third no occurance
                    while(s<e && nums[s]==nums[s+1])
                    s++;
                    while(s<e && nums[e]==nums[e-1])
                    e--;
                    s++;
                    e--;
                }
                else if(nums[s]+nums[e]>t)
                {
                    e--;
                }
                else
                {
                    s++;
                }
            }
            // to avoid first no occurence 
            while(i+1<n && nums[i]==nums[i+1])
            i++;
        }
        return result;
        
    }
};