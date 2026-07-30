class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxEnding;

            maxEnding = Math.max(nums[i],
                    Math.max(nums[i] * maxEnding, nums[i] * minEnding));

            minEnding = Math.min(nums[i],
                    Math.min(nums[i] * temp, nums[i] * minEnding));

            ans = Math.max(ans, maxEnding);
        }

        return ans;
    }
}