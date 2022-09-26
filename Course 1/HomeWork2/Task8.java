package HomeWork2;

public class Task8 {
    public static void main(String[] args) {
        //Задача №1
        var totalHours = 640;
        var employeeHours = 8;
        var totalEmployee = totalHours / employeeHours;
        System.out.println("Всего работников в компании - " + totalEmployee + " человек.");

        //Задача №2
        totalEmployee = totalEmployee + 94;
        totalHours = totalEmployee / employeeHours;
        System.out.println("Если в компании работает " + totalEmployee +
                " человека, то всего " + totalHours + " час работы может быть поделён между сотрудниками.");
    }
}
