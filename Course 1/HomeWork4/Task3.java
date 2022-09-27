package HomeWork4;

public class Task3 {
    public static void main(String[] args) {
        int trainWagonCapacity = 102;
        int wagonSeating       = 60;
        int wagonStanding      = trainWagonCapacity - wagonSeating;
        int totalPass          = 102;
        if (totalPass < wagonSeating) {
            System.out.println("Если в вагон зайдет " + totalPass +
                " человека, то сидячих мест останется " + (wagonSeating - totalPass));
        }
        else if (totalPass >= wagonSeating) {
                if (totalPass < trainWagonCapacity)
            System.out.println("Если в вагон зайдет " + totalPass +
                " человек, то останется " + (wagonSeating - (totalPass - wagonStanding)) + " стоячих места.");
        else if (totalPass >= trainWagonCapacity) {
                    System.out.println("Если в вагон зайдет " + totalPass +
                            " человека, то мест в вагоне не останется.");
            }
        }
    }
}
