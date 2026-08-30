class Solution {
    public int maxDepth(String s) {
        Stack<Character> st1= new Stack<Character>();
        Stack<Character> st2= new Stack<Character>();
        int max = 0;

        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                st1.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' && st1.peek() == '('){
                max = Math.max(st1.size(),max);
                st1.pop();
            }

        }
        return max;
    }
}