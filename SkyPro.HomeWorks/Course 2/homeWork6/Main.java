package homeWork6;

public class Main {
    public static void main(String[] args) {
        boolean test = Data.validate("test", "test123", "test123");
        if (test) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }
    }
}
