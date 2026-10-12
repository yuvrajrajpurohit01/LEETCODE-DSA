class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int cnt = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) != '9'){ cnt = i;
            break;}
        }
        String res = s.substring(0,cnt)+"9"+s.substring(cnt+1,s.length());
        int res1 = Integer.parseInt(res);
        return res1;
    }
}