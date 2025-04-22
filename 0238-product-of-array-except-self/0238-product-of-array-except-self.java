class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length,suffix=1;
        int[] result = new int[n];
        result[0]=1;
        for(int i =1;i<n;i++)
           result[i] = nums[i-1]*result[i-1];
        for(int i =n-2;i>=0;i--)
        {
            suffix*=nums[i+1];
            result[i]*= suffix;
        }
        return result;
    }
}