package HomeWork7;

public class Work3 {
    public static void main(String[] args){
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int currentYear = 2022;
        int previousYear = currentYear - 200;
        int nextYear = currentYear + 100;
        int cometTrajectory = 79;
        int year = 0;
        for (;year < nextYear; year = year + cometTrajectory) {
            if (year >= previousYear)
                System.out.println(year);
        }
    }

    public static void task2() {
        System.out.println('\n' + "Здача 2");
        int num1 = 2;
        int num2 = 1;
        int equally;
        for (;num2 <= 10; num2++) {
            equally = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + equally);
        }
    }
}
