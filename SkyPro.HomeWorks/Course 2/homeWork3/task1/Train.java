package homeWork3.task1;

public class Train extends Transport {
    private int priceTrip;
    private double travelTime;
    private String departureStation;
    private String arrivalStation;
    private int numberOfWagons;

    public Train(String brand, String model, String bodyColor, int yearOfRelease,
                 String country, int priceTrip, double travelTime,
                 String departureStation, String arrivalStation, int numberOfWagons) {
        super(brand, model, bodyColor, yearOfRelease, country);
        this.priceTrip = priceTrip;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.numberOfWagons = numberOfWagons;
    }

    public static void trains() {
        Train[] train = new Train[10];
        train[0] = new Train("Ласточка", "B-901", "Синий", 2011,
                "Россия", 3500, 0, "Беларусский вокзал", "Минск-Пассажирский", 11);
        train[1] = new Train("Ленинград", "D-125", "Зеленый", 2019,
                "Россия", 1700, 3.15, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        for (Train list : train) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    public String toString() {
        return "Поезд - " + getBrand() + " " + getModel() + ", " + getYearOfRelease() + " года выпуска, производства " + getCountry() + ". Цвет: " + getBodyColor() + '\n'
                + "Время поездки: " + getTravelTime() + ". Отправление от вокзала " + '\'' + getDepartureStation() + '\'' + " и следует до станции " + '\'' + getArrivalStation() + '\'' + '\n'
                + "Длина поезда " + getNumberOfWagons() + " вагонов. Цена билета: " + getPriceTrip() + '\n';
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        if (priceTrip == 0)
        this.priceTrip = priceTrip;
    }

    public double getTravelTime() {
        if (travelTime <= 0) {
            System.out.println("Время поездки не указано");
        }
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime == 0)
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation != null && !departureStation.isEmpty() && !departureStation.isBlank()) {
            this.departureStation = departureStation;
        } else {
            this.departureStation = "default";
        }
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation != null && !arrivalStation.isEmpty() && !arrivalStation.isBlank()) {
            this.arrivalStation = arrivalStation;
        } else {
            this.arrivalStation = "default";
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons == 0)
        this.numberOfWagons = numberOfWagons;
    }
}
