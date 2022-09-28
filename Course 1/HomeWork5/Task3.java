package HomeWork5;

public class Task3 {
    public static void main(String[] args) {
        /*год, номер которого кратен 400, — високосный;
          остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
          остальные годы, номер которых кратен 4, — високосные.
          все остальные годы — невисокосные.*/
        int year = 2022;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " год является невисокосный");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосный");
        } else {
            System.out.println(year + " год является невисокосный");
        }
    }
}
