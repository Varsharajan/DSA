class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> element = new HashSet<>();
        long sum =0, result =0;
        int i =0,j=0,n=nums.length;
        while(j<n)
        {
           
            while(element.contains(nums[j]))
            {
                element.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
           element.add(nums[j]);
           sum+=nums[j];
           if(j-i+1==k)
           {
              result = Math.max(sum,result);
              sum-=nums[i];
              element.remove(nums[i]);
              i++;
           }
        j++;
        }
        return result;
    }
}