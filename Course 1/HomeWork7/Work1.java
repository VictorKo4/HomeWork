package HomeWork7;

public class Work1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int amountOfSavings = 0;
        int month = 0;
        while (amountOfSavings <= 2_459_000) {
            amountOfSavings = amountOfSavings + amountOfSavings/100;
            amountOfSavings = amountOfSavings + contribution;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountOfSavings + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }   System.out.println();
        for (; i > 0; --i) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println('\n' + "Задача 3");
        int population = 12_000_000;
        int birthYear = population / 1000 * 17;
        int mortalityYear = population / 1000 * 8;
        int totalBirthYear = birthYear - mortalityYear;
        for (int i = 1; i <= 10; i++) {
            population = population + totalBirthYear;
            System.out.println("Год " + i + " ,численность населения составляет " + population);
        }
    }
}
