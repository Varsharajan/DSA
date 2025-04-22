class Solution {
    public int findMiddleIndex(int[] nums) {
      int totalSum =0;
      for(int num:nums)
       totalSum+=num;
       int leftSum =0;
       for(int i=0;i<nums.length;i++)
       {
        int rightSum = totalSum-nums[i]-leftSum;
        if(leftSum==rightSum)
           return i;
        leftSum+=nums[i];
       }
       return -1;

    }
}