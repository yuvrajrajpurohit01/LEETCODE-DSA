class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        int cnt = 0;
        for(int j = 0 ; j< arr.length ; j++){
            
                if(arr[j] != heights[j]){
                    cnt++;
                }
            
        }
        return cnt;
    }
}