package homeWork1.task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.maxim("Максим", "Минск", 1988, "бренд-менеджер");
        person.anna("Аня", "Москва", 1993, "методист образовательных программ");
        person.kate("Катя", "Калининград", 1992, "продакт-менеджер");
        person.artem("Артем", "Москва", 1995, "директор по развитию бизнеса");

        Car car = new Car();
        car.ladaGranta("Lada", "Granta", 1.7, "Yellow", 2015, "Russia");
        car.audiA8("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany");
        car.bmwZ8("BMW", "Z8", 2.4, "Red", 2018, "Germany");
        car.kiaSportage("KIA", "Sportage 4.0", 2.4, "Red", 2018, "South Korea");
        car.hyundaiAvante("Hyundai", "Avente", 1.6, "Orange", 2016, "South Korea");
    }
}
