package homeWork2.task2.transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tireSeasonality;


    public void ladaGranta() {
        this.brand = "Lada";
        this.model = "Granta";
        this.engineVolume = 1.7;
        this.color = "Yellow";
        this.year = 2015;
        this.country = "Russia";
        this.transmission = "Механическая";
        this.bodyType = "Седан";
        this.registrationNumber = "м123кв777";
        this.numberOfSeats = 5;
        this.tireSeasonality = "Лето";

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        } else if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        } else if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        } else if (engineVolume <= 0) {
            engineVolume = 1.5;
        } else if (color == null || color.isEmpty() || color.isBlank()) {
            color = "White";
        } else if (year <= 0) {
            year = 2000;
        } else if (transmission == null || transmission.isBlank() || transmission.isBlank()) {
            transmission = "default";
        } else if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        } else if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        } else if (registrationNumber.length() != 9) {
            registrationNumber = "Введен не верно!";
        } else if (numberOfSeats <= 0) {
            numberOfSeats = 0;
        } else if (tireSeasonality == null || tireSeasonality.isEmpty() || tireSeasonality.isBlank()) {
            tireSeasonality = "default";
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("КПП - " + transmission + ". Кузов - " + bodyType);
        System.out.println("Число мест - " + numberOfSeats + ". Резина - " + tireSeasonality);
        System.out.println("Регистрационный номер - " + registrationNumber);
        System.out.println("******************************");
    }

    public void audiA8() {
        this.brand = "Audi";
        this.model = "A8 50 L TDI quattro";
        this.engineVolume = 3.0;
        this.color = "Black";
        this.year = 2020;
        this.country = "Germany";
        this.transmission = "Автомат";
        this.bodyType = "Седан";
        this.registrationNumber = "в116кв123";
        this.numberOfSeats = 5;
        this.tireSeasonality = "Зима";

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        } else if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        } else if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        } else if (engineVolume <= 0) {
            engineVolume = 1.5;
        } else if (color == null || color.isEmpty() || color.isBlank()) {
            color = "White";
        } else if (year <= 0) {
            year = 2000;
        } else if (transmission == null || transmission.isBlank() || transmission.isBlank()) {
            transmission = "default";
        } else if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        } else if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        } else if (registrationNumber.length() != 9) {
            registrationNumber = "Введен не верно!";
        } else if (numberOfSeats <= 0) {
            numberOfSeats = 0;
        } else if (tireSeasonality == null || tireSeasonality.isEmpty() || tireSeasonality.isBlank()) {
            tireSeasonality = "default";
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("КПП - " + transmission + ". Кузов - " + bodyType);
        System.out.println("Число мест - " + numberOfSeats + ". Резина - " + tireSeasonality);
        System.out.println("Регистрационный номер - " + registrationNumber);
        System.out.println("******************************");
    }

    public void bmwZ8() {
        this.brand = "BMW";
        this.model = "Z8";
        this.engineVolume = 2.4;
        this.color = "Red";
        this.year = 2018;
        this.country = "Germany";
        this.transmission = "Механическая";
        this.bodyType = "Седан";
        this.registrationNumber = "";
        this.numberOfSeats = 5;
        this.tireSeasonality = "Зима";

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        } else if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        } else if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        } else if (engineVolume <= 0) {
            engineVolume = 1.5;
        } else if (color == null || color.isEmpty() || color.isBlank()) {
            color = "White";
        } else if (year <= 0) {
            year = 2000;
        } else if (transmission == null || transmission.isBlank() || transmission.isBlank()) {
            transmission = "default";
        } else if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        } else if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        } else if (registrationNumber.length() != 9) {
            registrationNumber = "Введен не верно!";
        } else if (numberOfSeats <= 0) {
            numberOfSeats = 0;
        } else if (tireSeasonality == null || tireSeasonality.isEmpty() || tireSeasonality.isBlank()) {
            tireSeasonality = "default";
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("КПП - " + transmission + ". Кузов - " + bodyType);
        System.out.println("Число мест - " + numberOfSeats + ". Резина - " + tireSeasonality);
        System.out.println("Регистрационный номер - " + registrationNumber);
        System.out.println("******************************");
    }

    public void kiaSportage() {
        this.brand = "KIA";
        this.model = "Sportage 4.0";
        this.engineVolume = 2.4;
        this.color = "Red";
        this.year = 2018;
        this.country = "South Korea";
        this.transmission = "Автомат";
        this.bodyType = "Кроссовер";
        this.registrationNumber = "к542ар126";
        this.numberOfSeats = 5;
        this.tireSeasonality = "Лето";

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        } else if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        } else if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        } else if (engineVolume <= 0) {
            engineVolume = 1.5;
        } else if (color == null || color.isEmpty() || color.isBlank()) {
            color = "White";
        } else if (year <= 0) {
            year = 2000;
        } else if (transmission == null || transmission.isBlank() || transmission.isBlank()) {
            transmission = "default";
        } else if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        } else if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        } else if (registrationNumber.length() != 9) {
            registrationNumber = "Введен не верно!";
        } else if (numberOfSeats <= 0) {
            numberOfSeats = 0;
        } else if (tireSeasonality == null || tireSeasonality.isEmpty() || tireSeasonality.isBlank()) {
            tireSeasonality = "default";
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("КПП - " + transmission + ". Кузов - " + bodyType);
        System.out.println("Число мест - " + numberOfSeats + ". Резина - " + tireSeasonality);
        System.out.println("Регистрационный номер - " + registrationNumber);
        System.out.println("******************************");
    }

    public void hyundaiAvante() {
        this.brand = "Hyundai";
        this.model = "Avente";
        this.engineVolume = 1.6;
        this.color = "Orange";
        this.year = 2016;
        this.country = "South Korea";
        this.transmission = "Автомат";
        this.bodyType = "Седан";
        this.registrationNumber = "р673мк177";
        this.numberOfSeats = 5;
        this.tireSeasonality = "";

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        } else if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        } else if (country == null || country.isEmpty() || country.isBlank()) {
            country = "default";
        } else if (engineVolume <= 0) {
            engineVolume = 1.5;
        } else if (color == null || color.isEmpty() || color.isBlank()) {
            color = "White";
        } else if (year <= 0) {
            year = 2000;
        } else if (transmission == null || transmission.isBlank() || transmission.isBlank()) {
            transmission = "default";
        } else if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        } else if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        } else if (registrationNumber.length() != 9) {
            registrationNumber = "Введен не верно!";
        } else if (numberOfSeats <= 0) {
            numberOfSeats = 0;
        } else if (tireSeasonality == null || tireSeasonality.isEmpty() || tireSeasonality.isBlank()) {
            tireSeasonality = "default";
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("КПП - " + transmission + ". Кузов - " + bodyType);
        System.out.println("Число мест - " + numberOfSeats + ". Резина - " + tireSeasonality);
        System.out.println("Регистрационный номер - " + registrationNumber);
        System.out.println("******************************");
    }

    public void changeTires() {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        switch (month) {
            case 12:
            case 1:
            case 2:
                setTireSeasonality("Пора ставить зимнюю резину");
                break;
            default:
                setTireSeasonality("Лето");
                break;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTireSeasonality() {
        return tireSeasonality;
    }

    public void setTireSeasonality(String tireSeasonality) {
        this.tireSeasonality = tireSeasonality;
    }
}
