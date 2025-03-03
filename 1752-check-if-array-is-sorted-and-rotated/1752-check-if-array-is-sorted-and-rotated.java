class Solution {
    public boolean check(int[] nums) {
     int count =0, n= nums.length;
     for(int i =1;i<n;i++)
     {
        if(nums[i]<nums[i-1])
          count++;
     }
     if(nums[0]<nums[n-1])
        count++;
     return count<=1;
    }
}