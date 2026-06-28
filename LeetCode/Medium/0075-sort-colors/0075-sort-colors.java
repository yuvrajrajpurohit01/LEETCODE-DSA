class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for(int i = 0 ; i<nums.length ; i++){
            freq[nums[i]]++;
        }
        int z = freq[0];
        int o = freq[1];
        int t = freq[2];
        int idx = 0;

        while (z-- > 0) {
            nums[idx++] = 0;
        }

        while (o-- > 0) {
            nums[idx++] = 1;
        }

        while (t-- > 0) {
            nums[idx++] = 2;
        }
        
    }
}