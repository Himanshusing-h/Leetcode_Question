class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        int low = 0;
        long sum = 0;
        long maxsum = 0;

        for (int high = 0; high < nums.length; high++) {

            // Remove elements until nums[high] is unique
            while (set.contains(nums[high])) {
                set.remove(nums[low]);
                sum -= nums[low];
                low++;
            }

            // Add current element
            set.add(nums[high]);
            sum += nums[high];

            // Window has exactly k elements
            if (high - low + 1 == k) {
                maxsum = Math.max(maxsum, sum);

                // Remove left element before next slide
                set.remove(nums[low]);
                sum -= nums[low];
                low++;
            }
        }

        return maxsum;
    }
}