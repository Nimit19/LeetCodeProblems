public class Q1281_SubtractTheProductAndSum {
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }

    static int subtractProductAndSum(int n) {
        int r,sum = 0,product = 1;
        while(n > 0){
            r = n % 10;
            sum = sum + r;
            product = product * r;
            n = n /10;
        }
        return (product - sum);
    }
}
