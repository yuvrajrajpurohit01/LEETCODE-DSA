class Solution {
    public int longestSubarray(int[] nums) {
       int left = 0;
       int z = 0;
       int answer = 0;
       for(int right = 0 ; right<nums.length ; right++){
            if(nums[right] == 0){
                z++;
            }
            if(z>1){
            while(z>1){
                if(nums[left]==0){
                    z--;
                }
                left++;
            }
            }
            answer = Math.max(answer,right-left);
       } 
       return answer;
    }
}