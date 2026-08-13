class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
        MaxSum = Math.max(MaxSum, currentSum);
        if (currentSum < 0) {
            currentSum = 0;
        }
    }
        return MaxSum;
    }
}