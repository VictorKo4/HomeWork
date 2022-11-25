package homeWork3.task1;

public class Bus extends Transport{
    public Bus(String brand, String model, String bodyColor, int yearOfRelease, String country) {
        super(brand, model, bodyColor, yearOfRelease, country);
    }

    public static void buses() {
        Bus[] bus = new Bus[10];
        bus[0] = new Bus("ЛиАЗ", "5256", "Белый", 1991, "Россия");
        bus[1] = new Bus("ПАЗ", "3206", "Желтый", 2005, "Россия");
        bus[2] = new Bus("Ikarus", "250", "Красный", 1995, "Венгрия");
        for (Bus list : bus) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + ". Цвет: " + getBodyColor() + ", " +
                getYearOfRelease() + " года выпуска. Производство: " + getCountry();
    }
}
