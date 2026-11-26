class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int l = 0;
        int right = nums.length - 1 ;
        int count = 0;
        while(l<right){
            int sum = nums[l] + nums[right];

            if(sum == k) {
                count++;
                l++;
                right--;
            }

            else if(sum<k) l++;

            else right--;

        }
        return count;
    }
}