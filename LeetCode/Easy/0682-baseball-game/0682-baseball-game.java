class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0 ; i<ops.length ; i++){
            if(ops[i].equals("C")){
                st.pop();
            }
            else if(ops[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(ops[i].equals("+")){
                int a = st.pop();
                int b = st.peek();
                int c = a+b;
                st.push(a);
                st.push(c);
            }
            else{
                int num = Integer.parseInt(ops[i]);
                st.push(num);
            }
        }
        int sum =0;
        if(st.isEmpty()) return 0;
        else{ 
            while(!st.isEmpty()){
            sum += st.pop();
            }
        }
        return sum;
    }
}