package HomeWork4;

public class Task2 {
    public static void main(String[] args) {
        int age = 7;
        if (age >= 7) {
            System.out.println("Ребенок ходит в школу, если его возраст равен или больше " + age + " годам.");
        }
        age = 18;
        if (age >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст " +
                    age + " и больше");
        }
        age = 24;
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу, если ему " +
                    age + " и больше лет.");
        }
    }
}
