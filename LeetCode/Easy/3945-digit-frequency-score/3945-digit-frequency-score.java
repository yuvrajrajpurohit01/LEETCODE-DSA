class Solution {
    public int digitFrequencyScore(int n) {
        String s = Integer.toString(n);
        int score = 0;
        for(int i = 0 ; i<s.length() ; i++){
            score+=s.charAt(i)-'0';
        }
        return score;
    }
}