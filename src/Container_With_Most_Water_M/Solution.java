package Container_With_Most_Water_M;

//11. Container With Most Water - Medium

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] height = {1,8,6,2,5,4,8,3,7};

        solution.maxArea(height);

    }

    public int maxArea(int[] height) {
        int result = 0;
        int minHeight = 0;
        int maxArea = 0;
        int sizeDif = 0;

        int indexOne = 0;
        int indexTwo = height.length - 1;
        while (indexOne < indexTwo) {
            if (height[indexOne] < height[indexTwo]) {
                minHeight = height[indexOne];
                sizeDif = indexTwo - indexOne;
                indexOne++;
            } else {
                minHeight = height[indexTwo];
                sizeDif = indexTwo - indexOne;
                indexTwo--;
            }
            maxArea = sizeDif * minHeight;
            if (result < maxArea)result = maxArea;
        }
        return result;
    }
}

//height =
//        [1,8,6,2,5,4,8,3,7]
//Output
//49
//Expected
//49