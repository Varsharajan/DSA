class Solution {
    public void sortColors(int[] nums) {
      int n= nums.length;
      int i=0,j=0,k=n-1;
      while(j<=k)
      {
        if(nums[j]==0)
        {
           swap(nums,i,j);
           i++;
           j++;
        }
        else if(nums[j]==1)
        {
            j++;
        }
        else
        {
            swap(nums,j,k);
            k--;
        }

      }  
    }
    public void swap(int[] nums,int start,int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}