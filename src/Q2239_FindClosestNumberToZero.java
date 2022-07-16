import java.util.Arrays;

public class Q2239_FindClosestNumberToZero {
    public static void main(String[] args) {

//        int [] nums = {-4,-2,1,4,8};
//        int [] nums = {2,1,-1};
        int[] nums = {-4, -2, 1, 4, 8};

        System.out.println(findClosestNumber(nums));
    }

    static int findClosestNumber(int[] nums) {

        int a;
        int ans = 0;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {

//             a = Math.abs(num); // --> Using Inbuilt function

            a = num;
            if (a < 0)
                a = a * -1;

            if (a < min) {
                min = a;
                ans = num;
            } else if (a == ans * -1 && num > ans)
                ans = num;

        }
        return ans;
    }
}
