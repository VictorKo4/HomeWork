package HomeWork10;

import java.util.Locale;

public class work {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    
    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println('\n' + "Задача 2");
        String firstName = "ivan";
        String middleName = "ivanovich";
        String lastName = "ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String full = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + full);
    }

    public static void task3() {
        System.out.println('\n' + "Задача 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}
