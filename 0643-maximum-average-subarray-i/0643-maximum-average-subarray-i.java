class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int n = nums.length, i=0,j=0,sum=0;
         double maxAvg = 0;
         while(j<n)
         {
            sum+=nums[j];
            if(j-i+1<k)
              j++;
            else if(j-i+1==k)
            {
                double average = (double)sum/k;
                maxAvg = Math.max(average,maxAvg);
                sum-=nums[i];
                i++;
                j++;
            }
           
         }
         return maxAvg;
    }
}