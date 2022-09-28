package HomeWork5;

public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 60;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
    }
}
