class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Single element is after this pair
                start = mid + 2;
            } else {
                // Single element is at mid or before
                end = mid;
            }
        }

        // Start will point to the single element
        return nums[start];
    }
}