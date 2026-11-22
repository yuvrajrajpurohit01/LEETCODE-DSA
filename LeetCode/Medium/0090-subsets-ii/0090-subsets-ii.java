class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        return fun(0,nums,current,al);
    }

    public List<List<Integer>> fun(int start, int[] arr, List<Integer> current, List<List<Integer>> al){
        al.add(new ArrayList<>(current));

        for (int i = start; i < arr.length; i++) {

            // Skip duplicates at the same level
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            // Pick
            current.add(arr[i]);

            fun(i + 1, arr, current, al);

            // Backtrack
            current.remove(current.size() - 1);
        }
    return al;
    }
}