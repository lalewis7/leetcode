class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap();

        // create a hashmap with the key being the value from nums and the
        // value the difference needed to sum to the target
        for (int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            if (hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i)
                return new int[]{i, hashMap.get(target - nums[i])};
        }

        // no solution
        return new int[]{};
    }
}