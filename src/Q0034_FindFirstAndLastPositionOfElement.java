import java.util.Arrays;

public class Q0034_FindFirstAndLastPositionOfElement {
    public static void main(String[] args) {

//        int[] nums = {5,7,7,8,8,10};
//        int target = 8;
//        int[] nums = {5,7,7,8,8,10};
//        int target = 6;
//        int[] nums = {};
//        int target = 0;
        int[] nums = {1};
        int target = 1;

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    static int[] searchRange(int[] nums, int target) {

        int c = 0;
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {

            if(target == nums[i] && c == 0){
                firstIndex= i;
                c++;
            }
            if (target == nums[i]) {
                lastIndex = i;
            }
        }
        return new int[] {firstIndex,lastIndex};
    }
}
