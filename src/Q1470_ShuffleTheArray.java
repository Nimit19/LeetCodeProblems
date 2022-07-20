import java.util.Arrays;

public class Q1470_ShuffleTheArray {
    public static void main(String[] args) {
//        int[] nums = {2,5,1,3,4,7};
//        int n = 3;

        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n) {

//        // 1]
//        int[] ans = new int[2*n];
//        int x = 0,j = 0,k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(i%2 == 0){
//                ans[x] = nums[j];
//                j++;
//            }else{
//                ans[x] = nums[n + k];
//                k++;
//            }
//            x++;
//        }
//        return ans;

        // 2]
        int[] ans = new int[2*n];
        int j = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;

    }
}
