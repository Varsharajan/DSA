class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         int i = 0, j = 0, n = nums.length;
        long sum = 0, maxSum = Long.MIN_VALUE;
        Set<Integer> set = new HashSet<>(); // Stores unique elements

        while (j < n) {
            // Add new element to sum & set
            sum += nums[j];

            // If duplicate found, shrink from left
            while (set.contains(nums[j]))
            {
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            set.add(nums[j]);

            // When window size reaches k
            if (j - i + 1 == k) 
            {
                maxSum = Math.max(maxSum, sum);
                
                // Remove leftmost element to slide window
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            
            j++; // Expand window
        }

        return maxSum == Long.MIN_VALUE ? 0 : maxSum; 
    }
}