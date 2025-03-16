class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, left =0, right = n-1,index = n-1;
        int[] result = new int[n];
        while(left<=right)
        {
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare>rightSquare)
            {
                result[index--] = leftSquare;
                left++;
            }
            else
             {
                result[index--] = rightSquare;
                right--;
             }
        }
        return result;
    }
}