package homeWork2.task3;

import homeWork2.task1.Flower;

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
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tireSeasonality, Key key, Insurance insurance) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.tireSeasonality = tireSeasonality;
        this.key = key;
        this.insurance = insurance;
    }

    public static void cars() {
            Car[] car = new Car[5];
            car[0] = new Car("Lada","Granta",1.7,"Yellow",2015,"Russia",
                    "Механическая","Седан","м123кв777",5,
                    "Лето",new Key("", ""),new Insurance("", "", "560002233"));
        for (Car list : car) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", tireSeasonality='" + tireSeasonality + '\'' +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public String getRemoteEngineStart(String remoteEngineStart) {
            if (remoteEngineStart != null && !remoteEngineStart.isEmpty() && !remoteEngineStart.isBlank()) {
                this.remoteEngineStart = remoteEngineStart;
            } else {
                this.remoteEngineStart = "default";
            }
            return this.remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public String getKeylessAccess(String keylessAccess) {
            if (keylessAccess != null && !keylessAccess.isEmpty() && !keylessAccess.isBlank()) {
                this.keylessAccess = keylessAccess;
            } else {
                this.keylessAccess = "default";
            }
            return this.keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = keylessAccess;
        }

        public String toString() {
            return "Удаленный запуск двигателя - " + getRemoteEngineStart(remoteEngineStart) + '\n' +
                    "Бесключевой доступ - " + getKeylessAccess(keylessAccess);
        }
    }

    public static class Insurance {
        private String insuranceValidityPeriod;
        private String costOfInsurance;
        private String insuranceNum;

        public Insurance(String insuranceValidityPeriod, String costOfInsurance, String insuranceNum) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            this.costOfInsurance = costOfInsurance;
            this.insuranceNum = insuranceNum;
        }

        public String getInsuranceValidityPeriod(String insuranceValidityPeriod) {
            if (insuranceValidityPeriod != null && !insuranceValidityPeriod.isEmpty() && !insuranceValidityPeriod.isBlank()) {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            } else {
                this.insuranceValidityPeriod = "default";
            }
            return this.insuranceValidityPeriod;
        }

        public String getCostOfInsurance(String costOfInsurance) {
            if (costOfInsurance != null && !costOfInsurance.isEmpty() && !costOfInsurance.isBlank()) {
                this.costOfInsurance = costOfInsurance;
            } else {
                this.costOfInsurance = "default";
            }
            return this.costOfInsurance;
        }

        public String getInsuranceNum(String insuranceNum) {
            if (this.insuranceNum.length() != 9) {
                this.insuranceNum = "Номер страховки некорректный!";
            } else {
                this.insuranceNum = insuranceNum;
            }
            return this.insuranceNum;
        }

        public String toString() {
            return "Срок действия страховки - " + getInsuranceValidityPeriod(insuranceValidityPeriod) + '\n' +
                    "Стоимость страховки - " + getCostOfInsurance(costOfInsurance) + '\n' +
                    "Номер страховки - " + getInsuranceNum(insuranceNum);
        }
    }



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
        System.out.println(new Key("", ""));
        System.out.println(new Insurance("", "", "560002233"));
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
        System.out.println(new Key("Есть", "Есть"));
        System.out.println(new Insurance("", "", ""));
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
        System.out.println(new Key("Есть", "Есть"));
        System.out.println(new Insurance("21.10.2023", "12000руб", "110036777"));
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
        System.out.println(new Key("Есть", "Есть"));
        System.out.println(new Insurance("21.10.2023", "10500руб", "223364128"));
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
        System.out.println(new Key(" ", "Есть"));
        System.out.println(new Insurance("16.10.2024", "8000руб", "721164465"));
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
