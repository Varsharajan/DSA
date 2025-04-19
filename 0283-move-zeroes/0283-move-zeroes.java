class Solution {
    public void moveZeroes(int[] nums) {
       int start =0, end =0, n = nums.length;
       while(end<n)
       {
         if(nums[end]!=0)
         {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
         }
         end++;
       } 
    }
}