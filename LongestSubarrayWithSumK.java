public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
       int n= a.length, i=0,j=0,result=0;
       long sum=0;
       while(j<n)
       {
          sum+=a[j];
          while(sum>k)
          {
            sum-=a[i];
            i++;
          }
          if(sum==k)
            result= Math.max(result, j-i+1);
             
          j++;
       }
       return result;

}
}
//TC =O(n) SC= O(1)
