class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> st = new Stack<Integer>();
        

        for(int i = 0 ; i<nums1.length ; i++){
            int val = -1;
            for(int j = 0 ;j<nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j ; k<nums2.length ; k++){
                        st.push(nums2[k]);
                        if(st.peek() > nums2[j]){
                            val = st.peek();
                            break;
                        }
                        else{
                            st.pop();
                        }
                    }
                }
            }
            res[i] = val;
        }
        return res;
    }
}