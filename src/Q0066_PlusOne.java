import java.util.Arrays;

public class Q0066_PlusOne {
    public static void main(String[] args) {

//        int[] nums = {9};
        int[] nums = {9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] != 9){
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
