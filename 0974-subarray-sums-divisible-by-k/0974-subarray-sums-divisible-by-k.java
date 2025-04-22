class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum =0, count =0;
        HashMap<Integer,Integer> result = new HashMap<>();
        result.put(0,1);
        for(int i =0;i<nums.length;i++)
        {
            sum+=nums[i];
            int mod = (sum%k+k)%k;
            if(result.containsKey(mod))
              count+=result.get(mod);
            result.put(mod,result.getOrDefault(mod,0)+1);
            
        }
        return count;
    }
}