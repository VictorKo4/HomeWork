package HomeWork4;

public class Task3_2 {
    public static void main(String[] args) {
        int age = 14;
        if (age < 5) {
            System.out.println("Если ребенку " + age + ", то он не может кататься на аттракционе.");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если ребенку " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если ребенку " + age + ", то он может кататься без сопровождения взрослого.");
        }
    }
}
