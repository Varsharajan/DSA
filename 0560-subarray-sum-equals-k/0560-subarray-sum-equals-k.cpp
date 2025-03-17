// TC =O(n)  SC = O(n)
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> prefixsum;
        // we r starting from sum as 0 , so we need to enter it into hashtable.
        // if first element itself comes up as k , then we need to consider that.
        prefixsum.insert({0,1});
        int sum =0 ,count =0;
        for(int i =0;i<nums.size();i++)
        {
            sum+=nums[i];
            // if sum-k is already present , we need to take its value
             auto it = prefixsum.find(sum-k);
            if(it!=prefixsum.end())
            {
                count+=it->second;
            }
           
            // we have to find wether the current  sum already exists in the hashtable.
            // if exists , increment its count , if not insert it as new 
           it = prefixsum.find(sum);
            if(it!=prefixsum.end())
            {
                it->second++;
            }
            else
            prefixsum.insert({sum,1});
             


        }
        return count;
    }
};