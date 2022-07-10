
public class Q1523_CountOddNumbers {
    public static void main(String[] args) {

        System.out.println(countOdds(21,22));
    }
    static int countOdds(int low, int high){
        // it's not work in LeetCode because of time limit
/*
        int c = 0;
        for (int i = low; i <=high; i++) {
            if(i % 2 == 1)
                c++;
        }
        return c;

 */

        int n = (high - low + 1)/2;;

        // if either high or low is odd
        if(high % 2 == 1 && low % 2 == 1){
            n++;
        }
        return n;

        // for even range - odd.    --> range = (high - low  + 1)
    }
}
//        If the range (high - low + 1) is even, the number of even and odd numbers in this range will be the same.
//        If the range (high - low + 1) is odd, the solution will depend on the parity of high and low.

/*
     range = (high - low + 1)
odd-odd
5 11  = 6 = Odd 5,7,9,11    Range = 7/2 + 1
          = Even 6,8,10
even-even
6 12  = 6 = Odd 7,9,11   Range = 7/2
          = Even 6,8,10,12
odd-even
5 12  = 7 = Odd  5,7,9,11   Range = 8/2
          = Even 6,8,10,12
21 22 = 1

even-odd
6 11  = 5 = Odd 7,9,11   Range = 6/2
          = Even 6,8,10




 */

