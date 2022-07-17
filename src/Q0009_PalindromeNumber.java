public class Q0009_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1521));
    }

    static boolean isPalindrome(int x) {

        // 1] Traverse all digit
//        int rev = 0;
//        int orignal = x;
//
//        // special case : if last digit is 0 than it's not a palindrome number
//        if(x % 10 == 0 && x!=0){
//            return false;
//        }
//
//        while(x > 0){
//            rev = (rev * 10) + x % 10;
//            x = x / 10;
//        }
//        return rev == orignal;

        // 2] Traverse half Number
        int rev = 0;

        if(x % 10 == 0 && x!=0){
            return false;
        }

        while(x > rev){
            rev = (rev * 10) + x % 10;
            x = x / 10;
        }
        return rev == x || rev/10 == x;
    }

}
