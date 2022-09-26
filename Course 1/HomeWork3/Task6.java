package HomeWork3;

public class Task6 {
    public static void main(String[] args) {
        int bananas = 80;
        int bananasWeight = 5 * bananas;
        int milk = 105;
        int milkWeight = milk * 2;
        int ice = 100 * 2;
        int egg = 70 * 4;
        int totalWeightGr = bananasWeight + milkWeight + ice + egg;
        float totalWeightKg = totalWeightGr / 1000f;
        System.out.println("Общий вес в граммах " + totalWeightGr + " ,а в килограммах " + totalWeightKg);
    }
}
