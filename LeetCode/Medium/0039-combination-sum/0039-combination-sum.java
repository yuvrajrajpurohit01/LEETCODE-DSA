class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        
        func(0,curr,al,target,candidates);
        return al;
    } 
    public void func(int i , List<Integer> curr ,List<List<Integer>> al, int sum ,int[] candidates){

        if(i == candidates.length){
            if(sum == 0){
            al.add(new ArrayList<>(curr));
            } 
            return;
        }
        //pick 
        if(candidates[i] <= sum){
            curr.add(candidates[i]);
            func(i,curr,al,sum-candidates[i],candidates);
            curr.remove(curr.size() -1);
        }
        //not Pick 
        
        func(i+1,curr,al,sum,candidates);

        return ;
    }
}