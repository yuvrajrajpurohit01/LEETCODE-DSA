class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");           
        map.put('8', "tuv");
        map.put('9', "wxyz");

        String s ="";
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        func(0,digits,sb,map,s,res);
        return res;
    }
    public List<String> func(int i , String digits ,StringBuilder sb, Map<Character, String> map , String s , List<String> res){
        if(i == digits.length()){
            res.add(sb.toString());
            return res;
        }
        
        s = map.get(digits.charAt(i));
        if (digits.isEmpty()) return res;

        
        for(int j = 0; j < s.length(); j++){

        // Pick a letter
        sb.append(s.charAt(j));

        // Recursive call
        func(i + 1, digits, sb , map, s, res);

        // Undo the pick (backtrack)
        sb.deleteCharAt(sb.length() - 1);

        }
        return res;
    }
} 