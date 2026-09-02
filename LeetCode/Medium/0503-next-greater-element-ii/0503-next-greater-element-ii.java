class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        int[] res = new int[nums.length];
        for(int i = nums.length -1 ; i>=0 ; i--){
            st.push(nums[i]);
        }
        for(int j = nums.length -1 ; j>=0 ;j--){
            while(!st.isEmpty() && st.peek()<=nums[j]){
                st.pop();
            }
            if(st.isEmpty()) res[j] = -1;
            else res[j] = st.peek();

            st.push(nums[j]);
        }
        return res;
    }
}