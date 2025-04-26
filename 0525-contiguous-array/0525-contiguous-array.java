class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> result = new HashMap<>();
        result.put(0,-1);
        int totalSum =0, count =0;
        for(int i =0;i<nums.length;i++)
        {
            totalSum+=(nums[i]==1)?1:-1;
            if(result.containsKey(totalSum))
            {
                if(i-result.get(totalSum)>=count)
                   count = i-result.get(totalSum);
            }
            else
            result.put(totalSum,i);
        }
        return count;
    }
}