class Solution {
    public String longestPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                int left = i;
                int right = j;
                boolean isit = true;

                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        isit = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isit && (j - i + 1 > ans.length())) {
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;
    }
}