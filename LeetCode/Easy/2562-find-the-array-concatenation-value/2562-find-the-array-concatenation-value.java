class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long value = 0;

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            String an = nums[i] + "" + nums[j];
            value += Long.parseLong(an);

            i++;
            j--;
        }

        if (i == j) {
            value += nums[i];
        }

        return value;
    }
}