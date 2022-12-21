package homeWork5;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Driver <T extends Transport> {
    private String name;
    private String license;
    private int experience;

    public Driver(String name, String license, int experience) {
        this.name = name;
        this.license = license;
        this.experience = experience;
    }

    public static Set<Driver> drivers = new HashSet<>();

    public void drive(Transport car) {
        System.out.println("Водитель " + getName() + " с категорией '" + getLicense() + "' может управлять автомобилем: " + car.getBrand() +
                " " + car.getModel());
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить движение");
    }

    public void refuelTheCar() {
        System.out.println("Заправить авто");
    }

    public String getName() {
        if (name == null || name.isEmpty() || name.isBlank()) {
            name = "Не указано";
        }
        return name;
    }

    public String getLicense() {
        if (license == null || license.isEmpty() || license.isBlank()) {
            throw new IllegalArgumentException("Категория прав не указана");
        }
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getExperience() {
        if (experience <= 0) {
            experience = 2;
        }
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
