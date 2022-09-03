public class Q0268_MissingNumber {
    public static void main(String[] args) {
//        int [] nums = {3,0,1};
//        int [] nums = {0,1};
        int [] nums = {1};
        System.out.println(missingNumber(nums));
    }

     // 1]
//    static int missingNumber(int[] nums) {
//
//        int sum = 0;
//        int max = nums[0];
//        boolean flag = false;
//        for (int i = 0; i < nums.length; i++) {
//            if(max < nums[i]){
//                max = nums[i];
//            }
//            sum = sum + nums[i];
//            if(nums[i] == 0){
//                flag = true;
//            }
//        }
//        if (!flag){
//            return 0;
//        }
//        int tsum = (max * (max + 1))/2;
//        int ans = tsum - sum;
//        if(ans == 0){
//            return max + 1;
//        }else {
//            return ans;
//        }
//    }


    // 2]
     static int missingNumber(int[] nums) {
        int sum = 0;
        int requiredSum = (nums.length * (nums.length + 1))/2;
         for (int num : nums) {
             sum = sum + num;
         }
        return requiredSum - sum;
    }


}
