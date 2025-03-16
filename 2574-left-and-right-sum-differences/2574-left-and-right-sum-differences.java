class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        left[0]= 0;
        right[n-1] =0;
        int sum=0;
        for(int i =1;i<n;i++)
        {
            sum+=nums[i-1];
            left[i] = sum;
        }
        sum =0;
        for(int i =n-2;i>=0;i--)
        {
            sum+=nums[i+1];
            right[i]= sum;
        }

        for(int i =0;i<n;i++)
        {
            result[i] = Math.abs(left[i]-right[i]);
        }
        return result;
    }
}