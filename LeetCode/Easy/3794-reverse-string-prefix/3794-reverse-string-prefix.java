class Solution {
    public String reversePrefix(String s, int k) {
        String res = "";
        for(int i = 0 ; i<k ;i++){
            res = s.charAt(i) + res;
        }
        res += s.substring(k,s.length());
        return res;
    }
}