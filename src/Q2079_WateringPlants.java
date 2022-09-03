public class Q2079_WateringPlants {
    public static void main(String[] args) {
//        int[] plants = {2,2,3,3};
//        int capacity = 5;
//        int[] plants = {1,1,1,4,2,3};
        int[] plants = {3,2,4,2,1};
        int capacity = 6;

        System.out.println(wateringPlants(plants,capacity));
    }

    static int wateringPlants(int[] plants, int capacity) {

        int step = 0;
        int count = 0;
        int originalCapacity = capacity;

        // Here two loop its take too much time
//        for (int i = 0; i < plants.length; i++) {
//
//            int waterWant = plants[i];
//
//            if(capacity < waterWant){
//                step = step + (2*count) ;
//                capacity = originalCapacity;
//            }
//
//            for (int j = 0; j < waterWant; j++) {
//                capacity--;
//            }
//            step++;
//            count++;
//
//
//        }

        for (int waterWant : plants) {

            if (capacity < waterWant) {
                step = step + (2 * count);
                capacity = originalCapacity;
            }
            capacity = capacity - waterWant;
            step++;
            count++;
        }

        return step;

    }
}
