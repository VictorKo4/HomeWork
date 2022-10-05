package HomeWork7;

public class Work2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int month = 0;
        while (contribution <= 12_000_000) {
            contribution = contribution + ((contribution * 7) / 100);
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + contribution + " рублей.");
        }
    }

    public static void task2() {
        System.out.println('\n' + "Задача 2");
        int contribution = 15_000;
        int month = 0;
        while (contribution <= 12_000_000) {
            contribution = contribution + ((contribution * 7) / 100);
            month = month + 1;
            if (month % 6 == 0)
            System.out.println("Месяц " + month + ", сумма накоплений равна " + contribution + " рублей.");
        }
    }

    public static void task3() {
        System.out.println('\n' + "Задача 3");
        int contribution = 15_000;
        int month = 0;
        int year = 9 * 12;
        while (month <= year) {
            contribution = contribution + ((contribution * 7) / 100);
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + contribution + " рублей.");
        }
    }

    public static void task4() {
        System.out.println('\n' + "Задача 4");
        int monthDay = 31;
        int friday = 1;
        for (; friday <= monthDay; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }
}