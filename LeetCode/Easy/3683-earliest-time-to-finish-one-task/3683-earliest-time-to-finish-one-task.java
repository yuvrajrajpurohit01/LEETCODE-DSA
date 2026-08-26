class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i<tasks.length ; i++){
            int val = 0;
            for(int j = 0 ; j<tasks[i].length ; j++){
                val += tasks[i][j];
            }
            min = Math.min(val,min);
        }
        return min;
    }
}