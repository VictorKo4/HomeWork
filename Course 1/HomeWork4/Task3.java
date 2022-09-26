package HomeWork4;

public class Task3 {
    public static void main(String[] args) {
        int trainWagonCapacity = 102;
        int wagonSeating       = 60;
        int wagonStanding      = trainWagonCapacity - wagonSeating;
        int totalPass          = 42;
        if (totalPass > wagonSeating) {
        } else {
            System.out.println("Если в вагон зайдет " + totalPass +
                    " человека, то сидячих мест останется " + (wagonSeating - totalPass));
        }
        totalPass = 60;
        if (totalPass > wagonSeating) {
        } else {
            System.out.println("Если в вагон зайдет " + totalPass +
                    " человек, то сидячих мест уже не останется. Останется " +
                    wagonStanding + " стоячих мест.");
        }
        totalPass = 102;
        if (totalPass > trainWagonCapacity) {
        } else {
        System.out.println("Если в вагон зайдет " + totalPass +
                " человека, то мест в вагоне не останется.");
        }
    }
}
