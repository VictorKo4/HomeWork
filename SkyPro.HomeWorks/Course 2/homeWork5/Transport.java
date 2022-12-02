package homeWork5;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public Transport() {

    }

    public abstract void printType();

    public abstract void start();

    public abstract void stop();

    public String getBrand() {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "Не указано";
        }
        return brand;
    }

    public String getModel() {
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "Не указано";
        }
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }
}
