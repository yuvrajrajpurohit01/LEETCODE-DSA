class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] alp = new int[26];
        for(int i = 0 ; i<text.length() ; i++){
            char ch = text.charAt(i);
            alp[ch - 'a']++ ;
        }
        int a = alp['a'-'a'];
        int b = alp['b'-'a'];
        int l = alp['l'-'a']/2;
        int o = alp['o'-'a']/2;
        int n = alp['n'-'a'];
         
        int res = Math.min(Math.min(Math.min(Math.min(a,b),l),o),n);
        return res;

    }
}