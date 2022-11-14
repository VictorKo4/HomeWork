package homeWork1.task3;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public void ladaGranta() {
        this.brand = "Lada";
        this.model = "Granta";
        this.engineVolume = 1.7;
        this.color = "Yellow";
        this.year = 2015;
        this.country = "Russia";
        if (brand == null) {
            brand = "default";
        } else if (model == null) {
            model = "default";
        } else if (country == null) {
            country = "default";
        } else if (engineVolume == 0) {
            engineVolume = 1.5;
        } else if (color == null) {
            color = "White";
        } else if (year == 0) {
            year = 2000;
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("******************************");
    }

    public void audiA8() {
        this.brand = "Audi";
        this.model = "A8 50 L TDI quattro";
        this.engineVolume = 3.0;
        this.color = "Black";
        this.year = 2020;
        this.country = "Germany";
        if (brand == null) {
            brand = "default";
        } else if (model == null) {
            model = "default";
        } else if (country == null) {
            country = "default";
        } else if (engineVolume == 0) {
            engineVolume = 1.5;
        } else if (color == null) {
            color = "White";
        } else if (year == 0) {
            year = 2000;
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("******************************");
    }

    public void bmwZ8() {
        this.brand = "BMW";
        this.model = "Z8";
        this.engineVolume = 2.4;
        this.color = "Red";
        this.year = 2018;
        this.country = "Germany";
        if (brand == null) {
            brand = "default";
        } else if (model == null) {
            model = "default";
        } else if (country == null) {
            country = "default";
        } else if (engineVolume == 0) {
            engineVolume = 1.5;
        } else if (color == null) {
            color = "White";
        } else if (year == 0) {
            year = 2000;
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("******************************");
    }

    public void kiaSportage() {
        this.brand = "KIA";
        this.model = "Sportage 4.0";
        this.engineVolume = 2.4;
        this.color = "Red";
        this.year = 2018;
        this.country = "South Korea";
        if (brand == null) {
            brand = "default";
        } else if (model == null) {
            model = "default";
        } else if (country == null) {
            country = "default";
        } else if (engineVolume == 0) {
            engineVolume = 1.5;
        } else if (color == null) {
            color = "White";
        } else if (year == 0) {
            year = 2000;
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("******************************");
    }

    public void hyundaiAvante() {
        this.brand = "Hyundai";
        this.model = "Avente";
        this.engineVolume = 1.6;
        this.color = "Orange";
        this.year = 2016;
        this.country = "South Korea";
        if (brand == null) {
            brand = "default";
        } else if (model == null) {
            model = "default";
        } else if (country == null) {
            country = "default";
        } else if (engineVolume == 0) {
            engineVolume = 1.5;
        } else if (color == null) {
            color = "White";
        } else if (year == 0) {
            year = 2000;
        }
        System.out.println('\n' + brand + " " + model);
        System.out.println("Объем двигателя - " + engineVolume + ". Цвет - " + color);
        System.out.println("Год выпуска - " + year + ". Сборка - " + country);
        System.out.println("******************************");
    }
}
