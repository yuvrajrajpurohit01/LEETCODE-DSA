class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        int total = 0;
        for (int x : nums) total += x;

        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
                int left = nums[i] * i - prefix;
                int right = (total - prefix - nums[i]) - nums[i] * (nums.length - i - 1);
                result[i] = left + right;
                prefix += nums[i];
            }    
        return result;
        }
}