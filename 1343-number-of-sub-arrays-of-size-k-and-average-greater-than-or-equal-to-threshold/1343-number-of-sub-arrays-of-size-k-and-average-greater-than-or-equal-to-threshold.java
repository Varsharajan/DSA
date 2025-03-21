class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n= arr.length, i=0, j=0, result =0, sum=0;
        while(j<n)
        {
           sum+=arr[j];
           if(j-i+1==k)
           {
                if(sum/k >=threshold)
                   result++;
                sum-=arr[i];
                i++;
           }
           j++;
        }
        return result;
    }
}