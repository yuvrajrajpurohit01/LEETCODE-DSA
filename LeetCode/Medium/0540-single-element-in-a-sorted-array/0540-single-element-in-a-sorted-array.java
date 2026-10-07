class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        for(int i = 0 ; i<nums.length ; i++){
            if(nums.length == 1 ) return nums[0];
            if(nums[0] != nums[1]) return nums[0];
            else if(nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length -1];
            else {
                if(nums[i] != nums[i+1] && nums[i-1] != nums[i]){
                    return nums[i];
                }
            }

        }
        return -1;
    }
}