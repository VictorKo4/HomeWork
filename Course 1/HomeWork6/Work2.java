package HomeWork6;

public class Work2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println('\n' + "Задача 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
    }
}
