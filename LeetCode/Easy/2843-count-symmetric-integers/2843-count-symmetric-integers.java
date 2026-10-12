class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        while(low <= high){
            String s = Integer.toString(low);
            if(s.length() % 2 == 0){
                int sum1 = 0;
                int sum2 = 0;
                for(int i = 0 ; i<s.length()/2 ; i++){
                    sum1 += (s.charAt(i) - '0');
                    sum2 += (s.charAt((s.length()/2) + i) - '0');
                }
                if(sum1 == sum2) cnt++;
            }
            low++;
        }
        return cnt;
    }
}