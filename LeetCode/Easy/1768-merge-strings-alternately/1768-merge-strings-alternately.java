class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        StringBuilder s = new StringBuilder();
        int count = 0;
        while(left < word1.length() || right < word2.length()){
            if(count % 2 == 0 && left<word1.length()){
                s.append(word1.charAt(left));
                left++;
            }
            else if(count % 2 != 0 && right<word2.length()){
                s.append(word2.charAt(right));
                right++;
            }
            count++;
        }
        String res = s.toString();
        return res;
    }
}