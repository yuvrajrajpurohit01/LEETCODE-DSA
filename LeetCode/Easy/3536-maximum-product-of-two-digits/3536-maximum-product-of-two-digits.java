class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        int prod = 0;
        for(int i = 0 ; i<s.length() ;i++){
            for(int j = i+1; j<s.length() ; j++){
            int mul =(s.charAt(i)-'0') * (s.charAt(j) -'0');
            prod = Math.max(prod,mul);
            }
        }
        return prod;
    }
}