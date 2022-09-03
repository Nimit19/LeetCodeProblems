public class Q1491_AverageSalary {
    public static void main(String[] args) {
        int[] a = {6000,5000,4000,3000,2000,1000};
        System.out.println(average(a));
    }
    static double average(int[] salary) {
        double max  = salary[0], min  = salary[0];
        double total = 0;

        for (int j : salary) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
            total = total + j;
        }
        return (total - max - min)/ (salary.length - 2);

    }
}

