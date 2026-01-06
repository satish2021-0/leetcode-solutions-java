class Solution {
    public int removeElement(int[] nums, int val) {
      int count = 0;

        for (int j = 0, i=0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
                count++;
            }
        }
        return count;
    }
}
