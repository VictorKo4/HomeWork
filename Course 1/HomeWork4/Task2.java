package HomeWork4;

public class Task2 {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу, если ему " +
                age + " и больше лет.");
        } else if  (age >= 18) {
            if (age <=23)
                System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст " +
                        age + " и больше");
        } else {
            System.out.println("Ребенок ходит в школу, если его возраст равен " +
                        age + " годам.");
        }
    }
}
