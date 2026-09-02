class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr = new int[temp.length];
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0 ; i<temp.length ; i++){
        while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
        int prev = st.pop();
        arr[prev] = i - prev;
        }   
        st.push(i);
        }
        return arr;
    }
}