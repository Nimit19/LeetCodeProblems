import java.util.Arrays;

public class Q0027_RemoveElement {
    public static void main(String[] args) {

        int[] a = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a,2));
    }

    static int removeElement(int[] nums, int val) {

        int[] ans = new int[nums.length];

        int c = 0;
        int j = 0;
        for (int num : nums) {

            if (num != val) {
                c++;
                ans[j] = num;
                j++;
            }
        }

        // without using builtin function
//        for (int i = 0; i < ans.length; i++) {
//            nums[i] = ans[i];
//        }

        // using builtin function // shorted way of above for loop
        System.arraycopy(ans, 0, nums, 0, ans.length);

//        System.out.println(Arrays.toString(nums));

        return c;
    }
}
