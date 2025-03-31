class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true; // Found a duplicate within range k
            }
            window.add(nums[i]);

            // Maintain the window size of at most k
            if (window.size() > k) {
                window.remove(nums[i - k]); // Remove the oldest element from the window
            }
        }

        return false;
    }
    }
