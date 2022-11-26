package homeWork4;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void stop() {
        System.out.println("Закончить движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");
    }

    @Override
    public String toString() {
        return "Truck: " + getBrand() + " " + getModel() + " " + getEngineVolume();
    }
}
