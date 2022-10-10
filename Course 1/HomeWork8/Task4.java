package HomeWork8;

public class Task4 {
    public static void main(String[] args) {
        int[] num1 = new int[3];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] % 2 == 0) {
                System.out.println(num1[i]);
            } else {
                num1[i] = num1[i] + 1;
                System.out.println(num1[i]);
            }
        }
    }
}
