package Product_of_array_except_self;

//238. Product of Array Except Self - Medium

public class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();

        int[] nums = {-1,1,0,-3,3};

        solution.productExceptSelf(nums);

    }

    public int[] productExceptSelf(int[] nums) {

        int N = nums.length;

        int[] output_arr = new int[N];

        output_arr[0] = 1;

        for(int i=1; i<N; i++){
            output_arr[i] = nums[i-1] * output_arr[i-1];
        }

        int R = 1;
        for(int i=N-1; i>=0; i--){
            output_arr[i] = output_arr[i] * R;
            R = R * nums[i];
        }

        return output_arr;

    }

}

//nums =
//        [-1,1,0,-3,3]
//Output
//[0,0,9,0,0]
//Expected
//[0,0,9,0,0]
