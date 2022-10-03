package HomeWork5;

public class Task5 {
    public static void main(String[] args) {
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц № " + monthNumber + " принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц № " + monthNumber + " принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц № " + monthNumber + " принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц № " + monthNumber + " принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}
