class Solution {
    public int countSubstrings(String s) {
        int cnt = 0;
        for(int i = 0 ; i<s.length() ; i++){ 
            for(int j = i + 1 ; j<= s.length();j++){
                String s1 = s.substring(i,j);

                int left = 0;
                int right = s1.length()-1;
                boolean val = true;

                while(left<right){
                    if(s1.charAt(left) != s1.charAt(right)){
                        val = false;
                    }
                    left++;
                    right--;
                }
                if(val){
                cnt++;
                }
            }
        }
        return cnt;
    }
}