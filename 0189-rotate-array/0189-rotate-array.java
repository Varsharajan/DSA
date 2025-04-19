class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<2)
         return;
         k%=n;
        rotateArray(nums,0,n-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,n-1);
    }
    void rotateArray(int[] nums,int start,int end)
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