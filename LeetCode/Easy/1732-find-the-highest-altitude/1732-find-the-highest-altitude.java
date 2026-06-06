class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i = 0 ; i<gain.length ; i++){
            cnt += gain[i];
            max = Math.max(max,cnt);

        }
        max = Math.max(0,max);
        return max;
    }
}