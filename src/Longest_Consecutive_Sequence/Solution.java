package Longest_Consecutive_Sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

//128. Longest Consecutive Sequence - Medium

public class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();

        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        solution.longestConsecutive(nums);

    }

    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int count = 1;
        int count_max = 1;
        LinkedHashSet<Integer> s = new LinkedHashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i ++){
            s.add(nums[i]);
        }

        List<Integer> list = new ArrayList<>(s);

        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) + 1 == list.get(i+1)){
                count++;
            } else {
                count = 1;
            }
            if(count > count_max){
                count_max = count;
            }
        }


        return count_max;

    }
}

//nums =
//        [0,3,7,2,5,8,4,6,0,1]
//Output
//9
//Expected
//9