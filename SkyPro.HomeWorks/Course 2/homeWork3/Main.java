package homeWork3;


import homeWork3.task2.Bus;
import homeWork3.task2.Car;
import homeWork3.task2.Train;
import homeWork3.task3.Amphibians;
import homeWork3.task3.Birds;
import homeWork3.task3.Mammals;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.refill();
        Car.cars();

        Train train = new Train();
        train.refill();
        Train.trains();

        Bus bus = new Bus();
        bus.refill();
        Bus.buses();


        Mammals.Herbivores.Herbivores();
        Mammals.Predators.Predators();
        Amphibians.amphibians();
        Birds.Flightless.Flightless();
        Birds.Flying.Flying();
    }
}
