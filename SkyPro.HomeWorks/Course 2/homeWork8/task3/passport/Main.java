package homeWork8.task3.passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("12345", "Ivanov", "Ivan", "Ivanovich", LocalDate.now().minusYears(30)));
        passports.add(new Passport("12345", "Ivanov", "Ivan", "Ivanovich", LocalDate.now().minusYears(30)));
        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
    }
}
