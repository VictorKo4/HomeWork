package HomeWork3;

public class Task8 {
    public static void main (String[] args) {
            int masha = 67_760; // зп в месяц
            int denis = 83_690; // зп в месяц
            int kris = 76_230; // зп в месяц
            double masha10percent = (masha * 0.1) + masha; // зп в месяц + 10%
            double denis10percent = (denis * 0.1) + denis; // зп в месяц + 10%
            double kris10percent = (kris * 0.1) + kris;  // зп в месяц + 10%
            long mashaAnnualIncome = masha * 12;
            long denisAnnualIncome = denis * 12;
            long krisAnnualIncome = kris * 12;
            double mashaAnnualIncome10Percent = (mashaAnnualIncome * 0.1) + mashaAnnualIncome;
            double denisAnnualIncome10Percent = (denisAnnualIncome * 0.1) + denisAnnualIncome;
            double krisAnnualIncome10Percent = (krisAnnualIncome * 0.1) + krisAnnualIncome;
            double diffMashaAnnualIncome = mashaAnnualIncome10Percent - mashaAnnualIncome;
            double diffDenisAnnualIncome = denisAnnualIncome10Percent - denisAnnualIncome;
            double diffKrisAnnualIncome = krisAnnualIncome10Percent - krisAnnualIncome;
            System.out.println("Маша теперь получает " + masha10percent +
                    " рублей. Годовой доход вырос на " + diffMashaAnnualIncome + " рублей.");
            System.out.println("Денис теперь получает " + denis10percent +
                    " рублей. Годовой доход вырос на " + diffDenisAnnualIncome + " рублей.");
            System.out.println("Кристина теперь получает " + kris10percent +
                    " рублей. Годовой доход вырос на " + diffKrisAnnualIncome + " рублей.");
    }
}