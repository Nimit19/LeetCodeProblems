import java.util.Arrays;

public class Q0026_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        int[] a = {1,1,2};
        int[] a = {0,0,1,1,1,2,2,3,3,4};
//        int[] a = {1,1};
        System.out.println(removeDuplicates(a));
    }
    static int removeDuplicates(int[] nums) {

        // 2]
        int[] ans = new int[nums.length];
        int j = 1;
        int c = 1;
//        nums[0] = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
                c++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return c;

//        // time taken
//        // 1]
//        int[] ans = new int[nums.length];
//        int j = 0;
//        int c = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            if(i == 0){
//                ans[i] = nums[i];
//                j++;
//                c++;
//            }else if(nums[i] != nums[i - 1]){
//                ans[j] = nums[i];
//                j++;
//                c++;
//            }
//        }
//        System.arraycopy(ans, 0, nums, 0, ans.length);
//        System.out.println(Arrays.toString(nums));
//        return c;
    }
}
