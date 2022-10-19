package HomeWork11;

import java.time.LocalDate;

public class Work {
    public static void checkLeapYear (int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год является високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " год является невисокосный");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосный");
        } else {
            System.out.println(year + " год является невисокосный");
        }
    }

    public static void year(int currentYear) {
        int clientDeviceYear = 2021;
        int clientOS = 1;
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    public static int getDeliveryDays(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
        } else if (deliveryDistance <= 60) {
            deliveryDay = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDay = 3;
        } else {
            deliveryDay = 4;
        }
        return deliveryDay;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        checkLeapYear(2022);
    }

    public static void task2() {
        System.out.println('\n' + "Задача 2");
        int currentYear = LocalDate.now().getYear();
        year(currentYear);
    }

    public static void task3() {
        System.out.println('\n' + "Задача 3");
        int days = getDeliveryDays(95);
        System.out.println("Потребуется дней: " + days);
    }
}
