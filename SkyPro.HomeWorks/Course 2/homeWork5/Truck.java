package homeWork5;



public class Truck extends Transport implements Competing {

    //public enum Weight {N1, N2, N3}

    private Transfers.Weight weight;

    public Truck(String brand, String model, double engineVolume, Transfers.Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Truck() {}

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Грузоподъемность: от" + weight.getFrom() + " до " + weight.getTo());
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
        return "Truck: " + getBrand() + " " + getModel() + " " + getEngineVolume();
    }

    public Transfers.Weight getWeight() {
        return weight;
    }

    public void setWeight(Transfers.Weight weight) {
        this.weight = weight;
    }
}
