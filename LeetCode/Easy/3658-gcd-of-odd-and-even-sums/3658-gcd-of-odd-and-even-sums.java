class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd = n*n;
        int sumeven = n*(n+1);
        int gcd = 1;
        for(int j = 1; j<= sumodd && j<= sumeven ; j++){
            if(sumodd % j == 0 && sumeven %j == 0){
                gcd = j;
            }
        }

        return gcd;
    }
}