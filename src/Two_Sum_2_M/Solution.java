package Two_Sum_2_M;

import java.util.Arrays;

//167. Two Sum || - Input Array is Sorted - Medium

public class Solution {

    public static void main(String[] args){

        int[] numbers = {2,7,11,15};
        int target = 9;

        Solution solution = new Solution();

        solution.twoSum(numbers, target);

    }

    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        int pointerOne = 0;
        int pointerTwo = numbers.length-1;

        Arrays.sort(numbers);

        while(pointerOne < pointerTwo){
            if((numbers[pointerOne] + numbers[pointerTwo]) == target){
                result[0] = pointerOne + 1;
                result[1] = pointerTwo + 1;
                return result;
            } else if((numbers[pointerOne] + numbers[pointerTwo]) < target){
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }
        return result;
    }
}

//Input
//        numbers =
//[2,7,11,15]
//target =
//        9
//Output
//[1,2]
//Expected
//[1,2]