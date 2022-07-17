import java.util.Arrays;

public class Q0287_FindTheDuplicateNumber {
    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {

//        // Time taken
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//                if(nums[i] == nums[i - 1]){
//                    return nums[i];
//                }
//        }
//        return -1;

        boolean[] repeat = new boolean[nums.length];

        System.out.println(Arrays.toString(repeat));

        for (int num : nums) {
            if (repeat[num]) {
                return num;
            }
            repeat[num] = true;
        }
        return  -1;
    }
}
