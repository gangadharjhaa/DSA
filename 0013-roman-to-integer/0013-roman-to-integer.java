class Solution {
    public int romanToInt(String s) {
        
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        int val = 0;
        int i = 0;

        while(i < s.length()){

        for (int j = 0; j < symbols.length; j++) {

            if(s.startsWith(symbols[j],i)){
                val = val + values[j];
                i = i + symbols[j].length();
            }
        }
        }
        return val;
        
    }
}