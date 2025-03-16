class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int totalSum =0;
        int leftSum =0;
        int rightSum;
        for(int i=0;i<size;i++)
        {
          totalSum+=nums[i];
        }
         for(int i=0;i<size;i++)
         {
           rightSum =totalSum-nums[i]-leftSum;
           ans[i] =Math.abs(leftSum-rightSum);
           leftSum+=nums[i];

         }
      return ans;
    }    
}