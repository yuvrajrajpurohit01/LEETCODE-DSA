class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<Character>();
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                if (!st.isEmpty()) {
                    s1 += '(';
                }

                st.push(s.charAt(i));
            }

            else {
                st.pop();

                if (!st.isEmpty()) {
                    s1 += ')';
                }
            }
        }

        return s1;
    }
}