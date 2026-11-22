class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        return fun(0,nums,current,al);
    }

    public List<List<Integer>> fun(int i, int[] arr, List<Integer> current, List<List<Integer>> al){
        if(i >= arr.length) {
        al.add(new ArrayList<>(current));
        return al;
    }

    // Pick
    current.add(arr[i]);
    fun(i + 1, arr, current, al);

    // Backtrack
    current.remove(current.size() - 1);

    // Not pick
    fun(i + 1, arr, current, al);
    return al;
    }
    
}