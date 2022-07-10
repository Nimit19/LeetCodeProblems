/*
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */

public class Q1295_EvenDigit {
    public static void main(String[] args) {
        int[] nums = {22,345,2,65,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
//        System.out.println(degit(-25056));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int element : nums) {
            if(isEven(element)){
                count++;
            }
        }
        return count;
    }

//    static int degit(int n){
//        int count = 0;
//        if(n<0){
//            n = n * -1;
//        }
//
//        if(n == 0){
//            return 1;
//        }
//
//        while (n>0){
//            n = n/10;
//            count++;
//        }
//        return count;
//    }

    static int degit(int n){
        int count = 0;
        if(n<0){
            n = n * -1;
        }

        if(n == 0){
            return 1;
        }

        return (int) (Math.log10(n) + 1 );  // Most Important, it's Decrease the time
    }



    static boolean isEven(int n){
        int a = degit(n);

        return a % 2 == 0;
    }
}
