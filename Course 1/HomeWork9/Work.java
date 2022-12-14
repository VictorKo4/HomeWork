package HomeWork9;

public class Work {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    static int[] arr = generateRandomArray();
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println('\n' + "Задача 2");
        int minSpendDay = 200_001;
        int maxSpendDay = 99_999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpendDay) {
                minSpendDay = arr[i];
            }
            if (arr[i] > maxSpendDay) {
                maxSpendDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendDay + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxSpendDay + " рублей.");
    }

    public static void task3() {
        System.out.println('\n' + "Задача 3");
        float sum = 0f;
        float averageSpendDay = 0f;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            averageSpendDay = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSpendDay + " рублей");
    }

    public static void task4() {
        System.out.println('\n' + "Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
