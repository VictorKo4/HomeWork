package homeWork3.task2;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tireSeasonality;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, double engineVolume, String bodyColor, int yearOfRelease, String country, int maxSpeed, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tireSeasonality, Key key, Insurance insurance) {
        super(brand, model, bodyColor, yearOfRelease, country, maxSpeed);

        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.tireSeasonality = tireSeasonality;
        this.key = key;
        this.insurance = insurance;
    }

    public Car() {

    }

    public static void cars() {
            Car[] car = new Car[10];
            car[0] = new Car("Lada","Granta",1.7,"Yellow",2015,"Russia",0,
                    "Механическая","Седан","м123кв777",5,
                    "Лето",new Key("", ""),
                    new Insurance(LocalDate.of(2020,9,21), "", "560002233"));
            car[1] = new Car("Audi","A8 50 L TDI quattro",3.0,"Black",2020,"Germany",0,
                    "Автомат","Седан","в116кв123",5,
                    "Зима",new Key("Есть", "Есть"),
                    new Insurance(LocalDate.of(2024,3,12), "", ""));
            car[2] = new Car("BMW","Z8",3.0,"Black",2021,"Germany",0,
                    "Механическая","Седан","",5,
                    "Зима",new Key("Есть", "Есть"),
                    new Insurance(LocalDate.of(2023,10,21), "12000руб", "110036777"));
            car[3] = new Car("KIA","Sportage 4.0",2.4,"Red",2018,"South Korea",0,
                    "Автомат","Кроссовер","к542ар126",5,
                    "Лето",new Key("Есть", "Есть"),
                    new Insurance(LocalDate.of(2024,9,26), "10500руб", "223364128"));
            car[4] = new Car("Hyundai","Avente",1.6,"Orange",2016,"South Korea",0,
                    "Автомат","Седан","р673мк177",5,
                    "Лето",new Key("", "Есть"),
                    new Insurance(LocalDate.of(2021,10,16), "8000руб", "721164465"));
            for (Car list : car) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }



    @Override
    public String toString() {
        return "Автомобиль - " +
                "brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", engineVolume = " + getEngineVolume() +
                ", color = '" + getBodyColor() + '\'' +
                ", year = " + getYearOfRelease() +
                ", country = '" + getCountry() + '\'' + '\n' +
                "КПП = '" + getTransmission() + '\'' +
                ", bodyType = '" + getBodyType() + '\'' +
                ", registrationNumber = '" + getRegistrationNumber() + '\'' +
                ", numberOfSeats = " + getNumberOfSeats() +
                ", tireSeasonality = '" + getTireSeasonality() + '\'' +
                key + ", insurance = " + insurance + '\n';
    }

    @Override
    public void refill() {
        System.out.println("Объекты класса car можно заправлять бензином, " +
                "дизелем на заправке или заряжать на специальных электропарковках, " +
                "если это электрокар." + '\n');
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
            return "\nУдаленный запуск двигателя - " + getRemoteEngineStart(remoteEngineStart) + '\n' +
                    "Бесключевой доступ - " + getKeylessAccess(keylessAccess);
        }
    }

    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;
        private String costOfInsurance;
        private String insuranceNum;

        public Insurance(LocalDate insuranceValidityPeriod, String costOfInsurance, String insuranceNum) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            this.costOfInsurance = costOfInsurance;
            this.insuranceNum = insuranceNum;
        }

        public LocalDate checkInsuranceValPer(LocalDate insuranceValidityPeriod) {
            if (LocalDate.now().isAfter(insuranceValidityPeriod)) {
                System.out.println("Страховка просрочена");
            }
            return insuranceValidityPeriod;
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
            return "Срок действия страховки - " + checkInsuranceValPer(insuranceValidityPeriod) + '\n' +
                    "Стоимость страховки - " + getCostOfInsurance(costOfInsurance) + '\n' +
                    "Номер страховки - " + getInsuranceNum(insuranceNum);
        }
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

    public String getBodyType() {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        }
        return bodyType;
    }

    public int getNumberOfSeats() {
        if (numberOfSeats <= 0) {
            numberOfSeats = 0;
        }
        return numberOfSeats;
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

    public String getTransmission() {
        if (transmission == null || transmission.isBlank() || transmission.isBlank()) {
            transmission = "default";
        }
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isBlank()) {
            transmission = "default";
        }
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        } else if (registrationNumber.length() != 9) {
            registrationNumber = "Введен не верно!";
        }
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        } else if (registrationNumber.length() != 9) {
            registrationNumber = "Введен не верно!";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getTireSeasonality() {
        if (tireSeasonality == null || tireSeasonality.isEmpty() || tireSeasonality.isBlank()) {
            tireSeasonality = "default";
        }
        return tireSeasonality;
    }

    public void setTireSeasonality(String tireSeasonality) {
        if (tireSeasonality == null || tireSeasonality.isEmpty() || tireSeasonality.isBlank()) {
            tireSeasonality = "default";
        }
        this.tireSeasonality = tireSeasonality;
    }
}
