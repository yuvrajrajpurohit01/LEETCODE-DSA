class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i = 0 ; i<nums1.length ; i++){
            for(int j = 0 ; j<nums2.length ; j++){
                if(nums1[i]==nums2[j]  && !s.contains(nums1[i])){
                    s.add(nums1[i]);
                }
            }
        }

        int[] arr = new int[s.size()];
        int k = 0;

        for (int num : s) {
        arr[k++] = num;
        }

        return arr;

    }
}