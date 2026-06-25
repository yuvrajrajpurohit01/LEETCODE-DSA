class Solution {
    public int minOperations(int[] nums) {
        
        int left = 0;
        int right = left+2;
        int count = 0;
        
        for(int i = 0 ; i<=nums.length - 3 ; i++){
            if(nums[i] == 0){
                for(int k = i ; k<i+3 ; k++){
                    nums[k] ^= 1;
                }
                count++;
            }
        }
        
        
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j]!=1){
                return -1;
            }
        }

        return count;
        
    }
}