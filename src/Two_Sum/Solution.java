package Two_Sum;

//1 - Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int x = i + 1; x < nums.length; x++) {
                if (nums[i] + nums[x] == target) {
                    return new int[] { i, x };
                }
            }
        }
        return new int[0];
    }
}

//nums =
//        [2,7,11,15]
//target =
//        9
//Output
//[0,1]
//Expected
//[0,1]