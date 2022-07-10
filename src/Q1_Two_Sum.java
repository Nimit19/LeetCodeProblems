import java.util.Arrays;

public class Q1_Two_Sum {
    public static void main(String[] args) {

        int[] nums = {2,56,11,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
