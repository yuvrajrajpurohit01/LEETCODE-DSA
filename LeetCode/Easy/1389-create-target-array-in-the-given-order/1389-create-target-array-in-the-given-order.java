class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> t = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            t.add(index[i],nums[i]);
        }
        for(int i = 0 ; i<nums.length ; i++){
            arr[i] = t.get(i);
        }
        return arr;
    }
}