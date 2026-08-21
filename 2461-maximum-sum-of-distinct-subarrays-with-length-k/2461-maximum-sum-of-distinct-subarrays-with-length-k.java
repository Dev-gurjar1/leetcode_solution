class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // ADD nums[right]
            sum += nums[right];

            map.put(
                nums[right],
                map.getOrDefault(nums[right], 0) + 1
            );

            // Window size greater than k
            if (right - left + 1 > k) {

                int leftElement = nums[left];

                // Remove left element from sum
                sum -= leftElement;

                // Decrease frequency
                map.put(
                    leftElement,
                    map.get(leftElement) - 1
                );

                // If frequency becomes 0, remove it
                if (map.get(leftElement) == 0) {
                    map.remove(leftElement);
                }

                left++;
            }

            // Window has exactly k elements
            if (right - left + 1 == k) {

                // All k elements are distinct
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }
}