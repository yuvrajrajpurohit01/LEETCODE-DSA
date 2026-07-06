class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String res = "";
        int n = s.length();
        if(s.charAt(0) == '-'){
            res += '-';
            while(n>1){
                res += s.charAt(n-1);
                n--;
            }
        }
        else{
            while(n>0){
                res += s.charAt(n-1);
                n--;
            }
        }
        long re = Long.parseLong(res);
        if (re > Integer.MAX_VALUE || re < Integer.MIN_VALUE){
            return 0;
        } 
        return (int) re;
    }
}