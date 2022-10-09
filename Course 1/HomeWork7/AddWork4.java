package HomeWork7;

public class AddWork4 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        String ping = " Ping";
        String pong = " Pong";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ping + pong);
            } else if (i % 5 == 0) {
                System.out.println(i + pong);
            } else if (i % 3 == 0) {
                System.out.println(i + ping);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void task2() {
        /*  Вывести первые 10 чисел последовательности Фибоначчи.
        Последовательность строится по следующему правилу:
      – Каждое следующее число равняется сумме двух предыдущих.
        Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        Должно получиться следующее:
        0 1 1 2 3 5 8 13 21 34  */

        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i <= 4; i++) {
            System.out.print(num1 + " " + num2 + " ");
            num1 = num1 + num2;
            num2 = num2 + num1;
        }
    }
}
