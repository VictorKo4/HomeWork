package homeWork3.task1;

public class Transport {

    private String brand;
    private String model;
    private int yearOfRelease;
    private String country;
    private String bodyColor;
    private String maxSpeed;

    public Transport(String brand, String model, String bodyColor, int yearOfRelease, String country) {
        this.brand = brand;
        this.model = model;
        this.bodyColor = bodyColor;
        this.yearOfRelease = yearOfRelease;
        this.country = country;
    }

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
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = "default";
        }
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        if (maxSpeed != null && !maxSpeed.isEmpty() && !maxSpeed.isBlank()) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = "default";
        }
    }
}
