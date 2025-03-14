class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0]+nums[1]+nums[2];
        int  n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n-2;i++)
        {
            int left = i+1, right = n-1;
            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target)
                  return target;
                if(Math.abs(target-sum)<Math.abs(target-closestSum))
                   closestSum = sum;
                if(sum<target)
                  left++;
                else
                 right--;
            }
        }
        return  closestSum;
    }
}