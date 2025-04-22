class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sum = new HashMap<>();
        sum.put(0,1);
        int count =0,totalSum =0;
        for(int num:nums)
        {
            totalSum+=num;
            if(sum.containsKey(totalSum-k))
            {
                count+=sum.get(totalSum-k);
            }
            sum.put(totalSum,sum.getOrDefault(totalSum,0)+1);
        }
    
    return count;
}
}