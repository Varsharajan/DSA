class Solution {
   // TC = O(n) SC- O(n)
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n,0);
        int left =0;
        int right = n-1;
        for(int i = n-1;i>=0;i--)
        {
            if(abs(nums[left])>abs(nums[right]))
            {
                result[i]= nums[left] * nums[left];
                left++;
              
            }
            else
            {
                result[i]= nums[right] * nums[right] ;
                right--;
            }

        }
        return result;
    }
};