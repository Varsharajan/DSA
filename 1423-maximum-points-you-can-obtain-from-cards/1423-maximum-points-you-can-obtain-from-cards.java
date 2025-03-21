class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum = Integer.MIN_VALUE, sum =0;
        int n = cardPoints.length;
        int rightIndex= n-1;
         for(int i=0;i<k;i++)
           sum+=cardPoints[i];
         maxSum = sum;
         for(int j =k-1;j>=0;j--)
         {
            sum-=cardPoints[j];
            sum+=cardPoints[rightIndex];
            maxSum = Math.max(sum,maxSum);
            rightIndex--;


         }
         return maxSum;
    }
}