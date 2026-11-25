class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        for(int i = 0 ; i<nums.length ; i++) freq[i] = false;
        func(nums,freq,curr,res);
        return res;

    }
    public void func(int[] nums , boolean[] freq , List<Integer> curr , List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                curr.add(nums[i]);

                func(nums,freq,curr,res);

                curr.remove(curr.size() - 1);
                freq[i] = false;
            }
        }

    }
}