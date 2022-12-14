package homeWork5;


import java.util.List;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {
    public static void car() {
        Car[] car = new Car[10];
        car[0] = new Car("Lada", "Priora", 1.6, Transfers.Body.SEDAN);
        car[1] = new Car("UAZ", "Patriot", 1.8, Transfers.Body.SUV);
        car[2] = new Car("Lamborghini", "Diablo", 5.7, Transfers.Body.COUPE);
        car[3] = new Car("Ferrari", "F40", 2.9, Transfers.Body.COUPE);
        for (Car list : car) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();
    }

    public static void truck() {
        Truck[] truck = new Truck[10];
        truck[0] = new Truck("KamAZ", "740", 10.8, Transfers.Weight.N2);
        truck[1] = new Truck("MAZ", "5440", 12.8, Transfers.Weight.N3);
        truck[2] = new Truck("MAN", "TGX", 10.5, Transfers.Weight.N1);
        truck[3] = new Truck("Scania", "S500", 16, Transfers.Weight.N3);
        for (Truck list : truck) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();
    }

    public static void bus() {
        Bus[] bus = new Bus[10];
        bus[0] = new Bus("ЛиАЗ", "5256", 6.7, Transfers.Capacity.MIDDLE);
        bus[1] = new Bus("ПАЗ", "3206", 4.67, Transfers.Capacity.MIDDLE);
        bus[2] = new Bus("Volvo", "9500", 7.7, Transfers.Capacity.ESPECIALLY_BIG);
        bus[3] = new Bus("МАЗ", "241", 3.8, Transfers.Capacity.ESPECIALLY_SMALL);
        for (Bus list : bus) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.diagnostics()) {
                try {
                    throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " проходит диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        //car();
        //truck();
        //bus();

        //Driver<Car> petr = new Driver<>("Петр", "B", 10);
        //Driver<Truck> ivan = new Driver<>("Иван", "C", 8);
        //Driver<Bus> nik = new Driver<>("Николай", "D", 12);

        //petr.drive(new Car("Lada", "Priora", 1.6, Transfers.Body.SEDAN));
        //ivan.drive(new Truck("KamAZ", "740", 10.8, Transfers.Weight.N2));
        //nik.drive(new Bus("ЛиАЗ", "5256", 6.7, Transfers.Capacity.MIDDLE));
        //System.out.println();

        Car lada = new Car("Lada", "Priora",1.6, Transfers.Body.SEDAN);
        Truck kamaz = new Truck("KamAZ", "740", 10.8, Transfers.Weight.N2);
        Bus liaz = new Bus("ЛиАЗ", "5256", 6.7, Transfers.Capacity.MIDDLE);

        //service(lada, kamaz, liaz);

        Mechanic<Car> vova = new Mechanic<>("Владимир", "Силиванов", "С-упер Т-ех О-бслуга");
        Sponsor kent = new Sponsor("Кент", 1000);

        Mechanic<Transport> anton = new Mechanic<>("Антон", "Антонов", "КамазСервис");
        Sponsor gazProm = new Sponsor("ГазПром", 1_000_000);

        Mechanic<Bus> gosha = new Mechanic<>("Григорий", "Рукоделов", "BusBoosT");
        Sponsor rus = new Sponsor("РосДор", 100_000);

        lada.addDriver(new Driver<>("Петр", "B", 10));
        lada.addMechanic(vova);
        lada.addSponsor(kent);

        kamaz.addDriver(new Driver<>("Иван", "C", 8));
        kamaz.addMechanic(anton);
        kamaz.addSponsor(gazProm);

        liaz.addDriver(new Driver<>("Николай", "D", 12));
        liaz.addMechanic(gosha);
        liaz.addSponsor(rus);

        List<Transport> transports = List.of(lada,kamaz,liaz);
        for (Transport transport : transports) {
            System.out.println("Водитель " + transport + " " + transport.getDrivers() + '\n' +
                    "Обслуживает механик " + transport.getMechanics() + '\n' +
                    "Спонсируется заезд фирмой: " + transport.getSponsors() + '\n');
        }

        ServiceStation<Transport> inspection = new ServiceStation<>();
        inspection.addTransport(lada);
        inspection.addTransport(kamaz);
        inspection.inspection();
    }
}
