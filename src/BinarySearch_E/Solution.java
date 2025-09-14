package BinarySearch_E;

import java.util.Arrays;

//704. Binarey Search - Easy

class Solution {

    public static void main(String args[]){

        Solution solution = new Solution();

        int[] nums = {-1,0,3,5,9,12};

        solution.search(nums, 9);

    }


    public int search(int[] nums, int target) {
        Arrays.sort(nums);

        int res = Arrays.binarySearch(nums, target);

        if (res < 0) return -1;

        return res;
    }
}

//Input
//        nums =
//[-1,0,3,5,9,12]
//target =
//        9
//Output
//4
//Expected
//4

//0ms