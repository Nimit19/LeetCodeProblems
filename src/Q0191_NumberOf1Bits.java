public class Q0191_NumberOf1Bits {
    public static void main(String[] args) {
        int n = 521;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {

            int count = 0;
            for(int i=1; i<33; i++){
                if((n & (1 << i)) != 0){
                    count++;
                }
            }
            return count;
    }
}
