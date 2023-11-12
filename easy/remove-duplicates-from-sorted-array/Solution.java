class Solution {
    public int removeDuplicates(int[] nums) {
        // index of replacing values
        int idx = 1;
        // last different value
        int num = nums[0];
        for (int i = 1; i < nums.length; i++){
            // new value
            if (nums[i] != num) {
                nums[idx] = nums[i];
                num = nums[i];
                idx++;
            }
        }
        return idx;
    }
}