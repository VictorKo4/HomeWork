package homeWork5;



public class Bus extends Transport implements Competing {

    //public enum Capacity {ESPECIALLY_SMALL, SMALL, MIDDLE, BIG, ESPECIALLY_BIG}

    Transfers.Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Transfers.Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Bus() {}

    @Override
    public boolean diagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместимость: от" + capacity.getFrom() + " до " + capacity.getTo());
        }
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
        return "Bus: " + getBrand() + " " + getModel() + " " + getEngineVolume();
    }
}
