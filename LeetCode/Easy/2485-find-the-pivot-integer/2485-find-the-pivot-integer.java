class Solution {
    public int pivotInteger(int n) {
        int[] sum = new int[n+1];
        int s = 0;
        if(n == 1){
            return n;
        }
        for(int i = 0 ; i<=n ; i++){
            s += i;
            sum[i] = s;
        }
        for(int j = 1 ; j < sum.length ; j++){
            int left = sum[j];
            int right = s - sum[j]+j;
            if(left == right){
                return j;
            }
        }
        return -1;
    }
}