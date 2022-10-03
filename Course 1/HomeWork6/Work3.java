package HomeWork6;

public class Work3 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 29_000;
        int amountOfSavings = 0;
        for (int i = 1; i <=12; i++) {
            amountOfSavings = amountOfSavings + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + amountOfSavings + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int contribution = 29_000;
        float amountOfSavings = 0;
        for (int i = 1; i <= 12; i++) {
            amountOfSavings = amountOfSavings + amountOfSavings/100;
            amountOfSavings = amountOfSavings + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + amountOfSavings + " рублей.");
        }
    }
}
