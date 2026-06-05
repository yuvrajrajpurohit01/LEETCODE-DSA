class Solution {
    public long perfectPairs(int[] nums) {
       long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Math.abs((long) nums[i]);
        }

        Arrays.sort(arr);

        long ans = 0;
        int l = 0;

        for (int r = 0; r < arr.length; r++) {
            while (arr[r] > 2 * arr[l]) {
                l++;
            }

            ans += r - l;
        }

        return ans;
    }
}