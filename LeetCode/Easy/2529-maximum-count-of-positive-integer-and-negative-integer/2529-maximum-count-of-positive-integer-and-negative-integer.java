class Solution {
    public int maximumCount(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int cnt = 0;
        int pos = 0;
        int neg = 0;
        if(nums[low] > 0) return nums.length;
        if(nums[high] < 0) return nums.length;

        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] > 0) pos++;
            if(nums[i] < 0) neg++;
        }
        
        return Math.max(pos,neg);
    }
}