class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean bar = false;
        int left = 0;

        if(s.length() == 0) return true;

        for(int i = 0 ; i<t.length() ; i++){
            
            if(left < s.length() && t.charAt(i) == s.charAt(left)){
                left++;
            }

            if(left == s.length()){
                bar = true;
                break;
            }

        }
        return bar;
    }
}