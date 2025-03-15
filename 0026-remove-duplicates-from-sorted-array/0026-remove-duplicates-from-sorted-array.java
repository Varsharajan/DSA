class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;  // Move i to the next position
                nums[i] = nums[j]; // Place unique element
            }
            j++; // Always move j forward
        }
        return i + 1; // The length of the unique elements
    }
 }
