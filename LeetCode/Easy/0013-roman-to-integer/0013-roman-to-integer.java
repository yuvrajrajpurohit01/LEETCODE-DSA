class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int result = 0;
         for (int i = 0; i < s.length(); i++) {

            int current = hashMap.get(s.charAt(i));

            if (i < s.length() - 1) {
                int next = hashMap.get(s.charAt(i + 1));

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }

        return result;
    }
}