package HomeWork3;

public class Task5 {
    public static void main(String[] args) {
        int totalCans = 120; // всего банок краски
        int whiteCansClass = 2; // банок белой краски на один класс
        int brownCansClass = 4; // банок коричневой краски на один класс
        int totalCansClass = whiteCansClass + brownCansClass; // всего банок на 1 класс
        int totalClass = totalCans / totalCansClass; // всего классов
        int totalWhiteCansClass = totalClass * whiteCansClass; // всего белой краски
        int totalBrownCansClass = totalClass * brownCansClass; // всего коричневой краски
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCansClass +
                " банок белой краски и " + totalBrownCansClass + " банок коричневой краски.");
    }
}
