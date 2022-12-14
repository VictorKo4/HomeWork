package homeWork4;

public class Main {
    public static void car() {
        Car[] car = new Car[10];
        car[0] = new Car("Lada", "Priora", 1.6);
        car[1] = new Car("UAZ", "Patriot", 1.8);
        car[2] = new Car("Lamborghini", "Diablo", 5.7);
        car[3] = new Car("Ferrari", "F40", 2.9);
        for (Car list : car) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();
    }

    public static void truck() {
        Truck[] truck = new Truck[10];
        truck[0] = new Truck("KamAZ", "740", 10.8);
        truck[1] = new Truck("MAZ", "5440", 12.8);
        truck[2] = new Truck("MAN", "TGX", 10.5);
        truck[3] = new Truck("Scania", "S500", 16);
        for (Truck list : truck) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();
    }

    public static void bus() {
        Bus[] bus = new Bus[10];
        bus[0] = new Bus("ЛиАЗ", "5256", 6.7);
        bus[1] = new Bus("ПАЗ", "3206", 4.67);
        bus[2] = new Bus("Volvo", "9500", 7.7);
        bus[3] = new Bus("МАЗ", "241", 3.8);
        for (Bus list : bus) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        car();
        truck();
        bus();

        Driver<Car> petr = new Driver<>("Петр", "B", 10);
        Driver<Truck> ivan = new Driver<>("Иван", "C", 8);
        Driver<Bus> nik = new Driver<>("Николай", "D", 12);

        petr.drive(new Car("Lada", "Priora", 1.6));
        ivan.drive(new Truck("KamAZ", "740", 10.8));
        nik.drive(new Bus("ЛиАЗ", "5256", 6.7));
    }
}
