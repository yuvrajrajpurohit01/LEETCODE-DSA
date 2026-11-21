class Solution {
    public boolean pal(String s , int i){
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return pal(s , i+1);
    }
    public boolean isPalindrome(String s) {
        String s1 = "";

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (Character.isLetterOrDigit(ch)) {
            s1 += Character.toLowerCase(ch);
        }
    }

    return pal(s1, 0);
    }
    
}