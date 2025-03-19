class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
       int[] result = new int[n];
       int i =0,j=1,k=0;
       for(int num:nums)
       {
            if(num>0)
            {
                result[i] = num;
                i+=2;
            }
            else
            {
                result[j] = num;
                j+=2;
            }
       }
       return result;

    }
}