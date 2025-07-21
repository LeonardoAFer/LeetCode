package Roman_to_Integer;

import java.util.HashMap;

//13. Roman to Integer - Easy

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int value = 0;

        for (int i = 0; i < s.length(); i++) {
            int atual = mapa.get(s.charAt(i));
            int proximo = (i + 1 < s.length()) ? mapa.get(s.charAt(i + 1)) : 0;

            if (atual < proximo) {
                value -= atual;
            } else {
                value += atual;
            }
        }

        return value;
    }
}


//Input
//        s =
//        "MCMXCIV"
//Output
//1994