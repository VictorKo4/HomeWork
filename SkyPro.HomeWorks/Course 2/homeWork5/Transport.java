package homeWork5;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public Transport() {

    }

    public abstract boolean diagnostics();

    public abstract void printType();

    public abstract void start();

    public abstract void stop();

    public abstract void repair();

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
