class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer,Integer> result = new HashMap<>();
       result.put(0,1);
       int totalSum =0,count=0;
       for(int i =0;i<nums.length;i++)
       {
           totalSum+=nums[i];
           int mod = totalSum%k;
           if(result.containsKey(mod))
           {
            count+=result.get(mod);
           }
           result.put(mod,result.getOrDefault(mod,0)+1);
       } 
       return count;
    }
}