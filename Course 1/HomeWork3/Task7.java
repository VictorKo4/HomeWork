package HomeWork3;
/*Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
чтобы оставаться в своей весовой категории.
Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.

Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько,
если каждый день будет худеть на 500 грамм.
Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.*/
public class Task7 {
    public static void main(String[] args) {
        int sportsmanWeight = 7 * 1000;
        int days1 = 250;
        int days2 = 500;
        int totalDays1 = sportsmanWeight / days1;
        int totalDays2 = sportsmanWeight / days2;
        int totalDays = totalDays1 + totalDays2;
        int daysOnAverage = totalDays / 2;
        System.out.println("Если спортсмен будет худеть на " + days1 + " грамм в день, уйдет " + totalDays1 + " дней.");
        System.out.println("Если спортсмен будет худеть на " + days2 + " грамм в день, уйдет " + totalDays2 + " дней.");
        System.out.println("В среднем он будет худеть " + daysOnAverage + " дней.");
    }
}
