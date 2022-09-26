package HomeWork2;

public class Task7 {
    public static void main(String[] args) {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var diffWeight = boxerWeight2 - boxerWeight1; // Использование вычитания
        System.out.println("Разница в весе " + diffWeight + " кг.");
        diffWeight = boxerWeight2 % boxerWeight1; // Использование %
        System.out.println("Разница в весе " + diffWeight + " кг.");
    }
}
