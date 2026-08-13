class Solution {
    public String convertDateToBinary(String date) {
        
        String result = "";
        String number = "";
        int integer = 0;
        
        for (int i = 0; i < date.length(); i++) {
            
            char character = date.charAt(i);
            
            if (character == '-') {
                integer = Integer.parseInt(number);
                result += Integer.toBinaryString(integer) + "-";
                number = "";
            } 
            else {
                number += character;
            }
        }
        
        integer = Integer.parseInt(number);
        result += Integer.toBinaryString(integer);
        
        return result;
    }
}