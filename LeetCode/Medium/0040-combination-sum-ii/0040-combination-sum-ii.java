class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> al = new ArrayList<>();

        func(0,target,candidates,al,res);
        return res;
    }
    public void func(int start , int sum , int[] candidates , List<Integer> al , List<List<Integer>> res ){

            if(sum == 0){
                res.add(new ArrayList<>(al));
                return;
            }
            

        for(int i = start; i < candidates.length; i++) {

            // Skip duplicates at the same level
            if(i > start && candidates[i] == candidates[i-1]) {
                continue;
            }

            if(candidates[i] > sum) {
                break;
            }

            // Pick
            al.add(candidates[i]);

            // i+1 because each element can be used only once
            func(i+1, sum-candidates[i], candidates, al, res);

            // Backtrack
            al.remove(al.size()-1);

        }  
        return ;

    }
}