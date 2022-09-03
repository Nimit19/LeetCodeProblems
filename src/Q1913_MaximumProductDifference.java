import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1913_MaximumProductDifference {
    public static void main(String[] args) {
//        int[] nums ={1,6,7,5,2,4,10,6,4};
        int[] nums = {8,3,5,7};
        System.out.println(maxProductDifference(nums));
    }

    static int maxProductDifference(int[] nums) {

//        // 1] Not much faster
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//        return ((nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]) );

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
//        int max1 = nums[0], max2 = nums[0];  // give an error in max1 and max2
//        int min1 = nums[0], min2 = nums[0];  // give an error in min1 and min2


        for (int num : nums) {
            if (num > max2) {
                max2 = num;
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                }
            }

            if (num < min2) {
                min2 = num;
                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                }
            }
        }
        return (max1*max2) - (min1 * min2);
    }
}
