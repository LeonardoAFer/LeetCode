package Group_Arrays_M;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//49. Group Anagrams - Medium

class Solution {

    public static void main(String[] args){
        Solution solution = new Solution();

        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        solution.groupAnagrams(strs);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> charCountMap1 = new HashMap<>();

        for (int x = 0; x < strs.length; x++) {
            char[] chars = strs[x].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (charCountMap1.containsKey(sortedStr)) {
                charCountMap1.get(sortedStr).add(strs[x]);
            } else {
                List<String> novaLista = new ArrayList<>();
                novaLista.add(strs[x]);
                charCountMap1.put(sortedStr, novaLista);
            }
        }

        return new ArrayList<>(charCountMap1.values());
    }
}
