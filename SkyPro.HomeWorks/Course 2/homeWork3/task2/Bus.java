package homeWork3.task2;

public class Bus extends Transport {
    public Bus(String brand, String model, String bodyColor, int yearOfRelease, String country, int maxSpeed) {
        super(brand, model, bodyColor, yearOfRelease, country, maxSpeed);
    }
    public Bus(){}

    @Override
    public void refill() {
        System.out.println("Объекты класса bus можно заправлять бензином или дизелем на заправке." + '\n');
    }

    public static void buses() {
        Bus[] bus = new Bus[10];
        bus[0] = new Bus("ЛиАЗ", "5256", "Белый", 1991, "Россия",0);
        bus[1] = new Bus("ПАЗ", "3206", "Желтый", 2005, "Россия",0);
        bus[2] = new Bus("Ikarus", "250", "Красный", 1995, "Венгрия",0);
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
