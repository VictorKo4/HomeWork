package homeWork5;


public class Car extends Transport implements Competing {

    //public enum Transfers {SEDAN,HATCHBACK,COUPE,ESTATE,SUV,CROSSOVER,PICKUP,VAN,MINIVAN}

    private Transfers.Body body;

    public Car(String brand, String model, double engineVolume, Transfers.Body body) {
        super(brand, model, engineVolume);
        this.body = body;
    }

    public Car(){}

    @Override
    public boolean diagnostics() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " проходит диагностику");
        return true;
    }

    @Override
    public void printType() {
        if (body == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println(getBody());
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
        return "Car: " + getBrand() + " " + getModel() + " " + getEngineVolume();
    }

    public String[] getAllBody() {
        String[] body = new String[Transfers.values().length];
        for (int i = 0; i < body.length; i++) {
           body[i] = Transfers.values()[i].name();
        }
        return body;
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    public Transfers.Body getBody() {
        return body;
    }

    public void setBody(Transfers.Body body) {
        this.body = body;
    }
}
