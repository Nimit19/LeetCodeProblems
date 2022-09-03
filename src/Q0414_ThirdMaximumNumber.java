public class Q0414_ThirdMaximumNumber {
    public static void main(String[] args) {
//        int[] nums = {3,2,2,1};
//        int[] nums = {1,1,2};


//        int[] nums =  {1,2,-2147483648};
        int[] nums = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
        System.out.println(thirdMax(nums));
    }
    static int thirdMax(int[] nums) {

        long max1 = Long.MIN_VALUE,max2 = Long.MIN_VALUE,max3 = Long.MIN_VALUE;

        int flag = 0;
        for (int num : nums) {
            if((num != max1) && (num != max2) && (num != max3)){
                if(num > max3){
                    max3 = num;
                    flag++;
                    if (num > max2) {
                        max3 = max2;
                        max2 = num;
                        if (num > max1) {
                            max2 = max1;
                            max1 = num;
                        }
                    }
                }
            }
        }

        if(flag < 3){
            return (int) max1;
        }
        return (int)max3;

    }
}
