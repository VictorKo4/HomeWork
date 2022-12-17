package homeWork5;

import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

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

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
