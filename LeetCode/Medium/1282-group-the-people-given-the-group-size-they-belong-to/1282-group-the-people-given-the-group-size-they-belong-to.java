class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= groupSizes.length; i++) {
            list.add(new ArrayList<>());
        }

        for (int j = 0; j < groupSizes.length; j++) {
            list.get(groupSizes[j]).add(j);
        }

        for (int size = 1; size < list.size(); size++) {
            List<Integer> curr = list.get(size);

            if (curr.isEmpty()) continue;

            for (int i = 0; i < curr.size(); i += size) {
                ans.add(new ArrayList<>(curr.subList(i, i + size)));
            }
        }

        return ans;
    }
}