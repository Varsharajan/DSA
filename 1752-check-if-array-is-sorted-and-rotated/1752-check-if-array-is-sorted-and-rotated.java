class Solution {
    public boolean check(int[] nums) {
        int end = nums.length-1;
         int count =0;
         for(int i =1;i<=end;i++)
         {
            if(nums[i]<nums[i-1])
              count++;
              
         }
         if(nums[0]<nums[end])
           count++;
         return count<=1;
    }
}