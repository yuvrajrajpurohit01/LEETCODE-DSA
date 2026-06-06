class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int cnt = 0;
        int[] c = new int[A.length];
        int[] freq = new int[A.length + 1];
        for(int i = 0 ; i<A.length ; i++){
           freq[A[i]]++;
           if(freq[A[i]] == 2) cnt++;

           freq[B[i]]++;
           if(freq[B[i]] == 2) cnt++;

           c[i] = cnt;
        }
        return c;
    }
}