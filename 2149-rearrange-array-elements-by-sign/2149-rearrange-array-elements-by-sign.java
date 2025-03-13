class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int posInd = 0, negInd =1;
        for(int i =0;i<n;i++)
        {
             if(nums[i]>0)
             {
                result[posInd] = nums[i];
                posInd+=2;
             }
             else
            {
                result[negInd] = nums[i];
                negInd+=2;

            }
        }
        return result;
    }
}