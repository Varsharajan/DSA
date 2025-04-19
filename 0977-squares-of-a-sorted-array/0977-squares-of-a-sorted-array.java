class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length-1;
        int[] result = new int[n+1];
        int start =0, end = n;
        
        while(start<=end)
        {
            int squareStart = nums[start] * nums[start];
            int squareEnd = nums[end] * nums[end];
           if(squareStart>=squareEnd)
           {
               result[n--] =squareStart;
               
               start++;
           }
           else
           {
             result[n--] = squareEnd;
             end--;
            

           }
        }
        return result;
    }
}