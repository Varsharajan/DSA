class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if( k==0 || k ==n )
          return;
        if(k>n)
           k = k%n;
        swap(nums,0,n-1); // rotate entire array
        swap(nums,0,k-1); // rotate first k elements
        swap(nums,k,n-1); // rotate n-k elements
        
    }

    public void swap(int[] nums, int start, int end)
    {
        while(start<end)
         {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
         }
    }
}