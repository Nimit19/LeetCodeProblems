public class Q0014_LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] strs = {"reflower","flow","flight"};
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));

    }
    static String longestCommonPrefix(String[] strs) {

        String a = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int n = 0;
            String b = strs[i];
            while (n < a.length() && n < b.length()){
                if(a.charAt(n) != b.charAt(n)){
                    break;
                }
                n++;
            }
            a = a.substring(0,n);
        }
        return a;
    }

}
