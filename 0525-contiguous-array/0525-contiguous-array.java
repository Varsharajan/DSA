class Solution {
    public int findMaxLength(int[] nums) {
      HashMap<Integer,Integer> result = new HashMap<>();
      result.put(0,-1);
      int sum =0, count=0;
      for(int i =0;i<nums.length;i++)
      {
        sum+=nums[i]==1?1:-1;
        if(result.containsKey(sum))
            {
                int range = i-result.get(sum);
                count = range>count?range:count;
            }
        else
          result.put(sum,i);

      }
      return count;
    }
}