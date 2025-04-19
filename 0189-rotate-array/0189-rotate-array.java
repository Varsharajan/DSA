class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        if(n<1)
         return;
        rotateArray(nums,0,n);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,n);
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