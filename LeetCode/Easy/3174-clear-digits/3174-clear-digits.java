class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<Character>();
        String res ="";
        for(int i = 0 ; i<s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
            if(!st.isEmpty()){st.pop();}
        }
        else{st.push(s.charAt(i));}
        }
        
       while (!st.isEmpty()) {
            res += st.pop();
        }
        StringBuilder res1 = new StringBuilder(res);
        res1.reverse();
        return res1.toString();
    }
}