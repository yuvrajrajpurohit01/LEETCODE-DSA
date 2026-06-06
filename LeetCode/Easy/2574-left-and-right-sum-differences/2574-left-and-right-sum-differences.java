class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        int[] ans = new int[nums.length];
        lsum[0] = 0;

        int t = 0;
        for(int i = 1 ; i<nums.length ; i++){
            t += nums[i];
            lsum[i] = t;
        }
        for(int j = 0 ; j<nums.length ; j++){
            rsum[j] = t;
            t -= nums[j];
        }
        for(int k = 0 ; k<nums.length ; k++){
            ans[k] = Math.abs(lsum[k] - rsum[k]);
        }
        return ans;
    }
}