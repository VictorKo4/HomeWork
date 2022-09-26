package HomeWork3;

public class Task4 {
    public static void main(String[] args) {
        int bottleMakingMachine = 16; // бутылок за 2 мин.
        bottleMakingMachine = bottleMakingMachine / 2; // бутылок за 1 мин
        int bMM20 = bottleMakingMachine * 20; // бутылок за 20 мин
        System.out.println("За 20 мин. машина произвела бутылок " + bMM20 + " штук.");
        int hours1 = bMM20 * 3; // бутылок за один час
        int day1 = 24; // сутки
        int bMM24H = hours1 * day1; // бутылок за сутки
        System.out.println("За сутки машина произвела бутылок " + bMM24H + " штук.");
        int day3 = 3; // три дня
        int bMM3day = bMM24H * day3; // бутылок за 3 дня
        System.out.println("За 3 дня машина произвела бутылок " + bMM3day + " штук.");
        int month = bMM24H * 30; // бутылок за месяц
        System.out.println("За месяц дня машина произвела бутылок " + month + " штук.");
    }
}
