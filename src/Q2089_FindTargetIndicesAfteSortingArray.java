import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2089_FindTargetIndicesAfteSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
//        int[] nums = {1,2,5,2,3};
//        int target = 3;
//        int[] nums = {1,2,5,2,3};
//        int target = 5;
//        int[] nums = {1,2,5,2,3};
//        int target = 10;

        System.out.println(targetIndices(nums,target));
    }

    static List<Integer> targetIndices(int[] nums, int target) {

        // 1] Time Taken
//        Arrays.sort(nums);
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == target){
//                ans.add(i);
//            }
//        }
//        return ans;

        // 2]
        int c = 0;
        int matched = 0;

        for (int num : nums) {
            if (num < target) {
                c++;
            } else if (num == target) {
                matched++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(matched > 0){
            ans.add(c++);
            matched--;
        }

        return ans;

    }
}
