package homeWork4;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
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
        return "Car: " + getBrand() + " " + getModel() + " " + getEngineVolume();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}
