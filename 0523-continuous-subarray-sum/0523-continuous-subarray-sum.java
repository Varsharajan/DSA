class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> result = new HashMap<>();
        result.put(0,-1);
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int mod = sum%k;
            if(result.containsKey(mod))
            {
                 if(i-(result.get(mod))>=2)
                   return true;
            }
            else
            result.put(mod,i);
        }
        return false;
    }
}