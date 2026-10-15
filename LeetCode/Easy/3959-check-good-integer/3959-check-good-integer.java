class Solution {
    public boolean checkGoodInteger(int n) {
        String s = Integer.toString(n);
        int digsum = 0;
        int squaresum = 0;
        for(int i = 0 ; i<s.length() ; i++){
            digsum += s.charAt(i) -'0';
            squaresum += (s.charAt(i) - '0')*(s.charAt(i) - '0');
        }

        if((squaresum - digsum)>=50) return true;
        return false;
        
    }
}