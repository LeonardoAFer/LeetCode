package Valid_Anagram;

import java.util.HashMap;

//242 - Valid Anagram

class Solution {

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        solution.isAnagram("rat", "car");
//
//    }

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> charCountMap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charCountMap2 = new HashMap<Character, Integer>();

        char[] strArray1 = s.toCharArray();
        char[] strArray2 = t.toCharArray();

        for (char c : strArray1){
            if (charCountMap1.containsKey(c)){
                charCountMap1.put(c, charCountMap1.getOrDefault(c,0) + 1);
            }else{
                charCountMap1.put(c, 1);
            }
        }

        for (char c : strArray2){
            if (charCountMap2.containsKey(c)){
                charCountMap2.put(c, charCountMap2.getOrDefault(c,0) + 1);
            }else{
                charCountMap2.put(c, 1);
            }
        }

        if (charCountMap1.equals(charCountMap2)){
            return true;
        }else{
            return false;
        }

    }

}

//Input
//        s =
//        "anagram"
//t =
//        "nagaram"
//Output
//true
//Expected
//true

