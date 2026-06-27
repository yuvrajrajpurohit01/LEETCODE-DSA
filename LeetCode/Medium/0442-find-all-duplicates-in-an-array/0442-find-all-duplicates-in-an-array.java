class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq = new int[nums.length+1];
        List<Integer> ar = new ArrayList<>();

        for(int i = 0 ; i< nums.length ; i++){
            freq[nums[i]]++;
        }
        for(int j = 0 ; j<freq.length ; j++){
            if(freq[j]==2){
                ar.add(j);
            }
        }
        return ar;
    }
}