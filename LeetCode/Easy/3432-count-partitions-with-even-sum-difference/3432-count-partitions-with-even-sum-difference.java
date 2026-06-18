class Solution {
    public int countPartitions(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        int cnt = 0 ;
        for(int j = 0 ; j<arr.length - 1; j++){
           int left = arr[j];
           int right = sum - arr[j];
           if((left - right)% 2 == 0){
            cnt++;
           }
        }
        return cnt;
    }
}