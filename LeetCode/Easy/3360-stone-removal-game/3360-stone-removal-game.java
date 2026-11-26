class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        if(n==10) return true;
        
        int n1 = n - 10;
        
        boolean chance = true;

        int remove = 9;


        while(n1>=remove){
            n1 -=remove;
            chance = !chance;
            remove--;
        }
        return chance;
    }
}