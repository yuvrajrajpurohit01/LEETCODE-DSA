class Solution {
    public int minOperations(int n) {
               int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;
        }

        int cnt = 0;
        int mid = n / 2;

        if (n % 2 != 0) {
            int l = 0;
            while (l < mid) {
                cnt += arr[mid] - arr[l];
                l++;
            }
        } else { 
            int target = (arr[mid] + arr[mid - 1]) / 2;

            int l = 0;
            while (l < mid) {
                cnt += target - arr[l];
                l++;
            }
        }

        return cnt;

    }
}