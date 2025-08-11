package Top_K_Frequent_Elements_M;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//341. Top K Frequent Elements - Medium

class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();

        int[] nums = {1,1,1,2,2,3};

        solution.topKFrequent(nums, 2);

    }

    public int[] topKFrequent(int[] nums, int k) {

        int[] num = new int[k];
        int count = 0;

        HashMap<Integer, Integer>  integerCounMap = new HashMap<>();

        for(int x : nums){
            if (integerCounMap.containsKey(x)){
                integerCounMap.put(x, integerCounMap.getOrDefault(x,0) + 1);
            }else{
                integerCounMap.put(x,1);
            }
        }

        List<Map.Entry<Integer, Integer>> numsList = new ArrayList<>(integerCounMap.entrySet());
        numsList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Integer> entry : numsList) {
            num[count++] = entry.getKey();
            if (count == k){
                break;
            }
        }

        return num;
    }
}

//
//Input
//        nums =
//[1,1,1,2,2,3]
//k =
//        2
//Output
//[1,2]
//Expected
//[1,2]