class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum =0, totalSum =0, rightInd= cardPoints.length-1;
        for(int i=0;i<k;i++)
        {
            totalSum+=cardPoints[i];
        }
        maxSum = totalSum;
        for(int i =k-1;i>=0;i--)
        {
            totalSum-=cardPoints[i];
            totalSum+=cardPoints[rightInd];
            maxSum = Math.max(maxSum,totalSum);
            rightInd--;
        }
        return maxSum;
        
    }
}