package Three_Sum_M;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3Sum - Medium

public class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();

        int[] nums = {-1,0,1,2,-1,-4};

        solution.threeSum(nums);

    }

    public List<List<Integer>> threeSum(int[] nums) {

        int target = 0;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i< nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            int pointerOne = i+1;
            int pointerTwo = nums.length-1;
            while(pointerOne < pointerTwo){
                if((nums[i] + nums[pointerOne] + nums[pointerTwo]) == target){
                    result.add(Arrays.asList(nums[i], nums[pointerOne], nums[pointerTwo]));
                    while(pointerOne < pointerTwo && nums[pointerOne] == nums[pointerOne+1]) pointerOne++;
                    while(pointerOne < pointerTwo && nums[pointerTwo] == nums[pointerTwo-1]) pointerTwo--;
                    pointerOne++;
                    pointerTwo--;
                }else if((nums[i] + nums[pointerOne] + nums[pointerTwo]) < 0){
                    pointerOne++;
                }else{
                    pointerTwo--;
                }
            }
        }
        return result;
    }
}

//Input
//        nums =
//[-1,0,1,2,-1,-4]
//Output
//[[-1,-1,2],[-1,0,1]]
//Expected
//[[-1,-1,2],[-1,0,1]]