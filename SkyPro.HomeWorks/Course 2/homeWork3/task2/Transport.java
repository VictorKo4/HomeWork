package homeWork3.task2;

public abstract class Transport {

    private String brand;
    private String model;
    private int yearOfRelease;
    private String country;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, String bodyColor, int yearOfRelease, String country, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.model = model;
        this.bodyColor = bodyColor;
        this.yearOfRelease = yearOfRelease;
        this.country = country;
    }

    public Transport() {}

    public abstract void refill();

    public int getYearOfRelease() {
        if (yearOfRelease <= 0) {
            yearOfRelease = 2000;
        }
        return yearOfRelease;
    }

    public String getCountry() {
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        }
        return country;
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        }
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
    }

    public String getBodyColor() {
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            bodyColor = bodyColor;
        } else {
            bodyColor = "default";
        }
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "default";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }
}
