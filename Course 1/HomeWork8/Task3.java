package HomeWork8;

public class Task3 {
    public static void main(String[] args) {
        int[] num1 = new int[3];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;

        double[] num2 = {1.57, 7.654, 9.986};

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println(num1[2] + ", " + num1[1] + ", " + num1[0]);
        System.out.println(num2[2] + ", " + num2[1] + ", " + num2[0]);
        System.out.println(array[4] + ", " + array[3] + ", " + array[2] + ", " + array[1] + ", " +
                array[0]);
    }
}
