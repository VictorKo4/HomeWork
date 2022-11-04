package courseWork1;

public class Main {
    public static Employee[] employees() {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 35_480, 1);
        employee[1] = new Employee("Петров", "Петр", "Петрович", 36_320, 2);
        employee[2] = new Employee("Степаненко", "Степан", "Степанович", 34_360, 3);
        employee[3] = new Employee("Кошкина", "Елена", "Федоровна",32_478, 4);
        employee[4] = new Employee("Сидоров", "Антон", "Павлович", 34_800, 5);
        return employee;
    }

    static Employee[] employee = employees();

    public static void listOfAllEmployees() {
        System.out.println("Список сотрудников:");
        for (Employee list : employee) {
            if (list == null) {
                break;
            }
            System.out.println(list);
        }
    }

    public static void expensesPerMonth() {
        System.out.println();
        float sum = 0;
        for (Employee i : employee) {
            if (i == null) {
                break;
            }
            sum += i.salary;
        }
        System.out.println("Сумма затрат на зарплаты: " + sum);
    }

    public static void minSalaryEmployee() {
        float minSum = 1_000_000;
        String fullName = null;
        int dept = 0;
        int id = 0;
        for (Employee i : employee) {
            if (i == null) {
                break;
            } else if (i.salary < minSum) {
                minSum = i.salary;
                fullName = i.fullName;
                dept = i.dept;
                id = i.id;
            }
        }
        System.out.println('\n' + "Сотрудник с минимальной ЗП: " + '\n' +
                fullName + " --- id: " + id + '\n' + "Отдел №" + dept + ", зарплата = " + minSum);
    }

    public static void maxSalaryEmployee() {
        float maxSum = 0;
        String fullName = null;
        int dept = 0;
        int id = 0;
        for (Employee i : employee) {
            if (i == null) {
                break;
            } else if (i.salary > maxSum) {
                maxSum = i.salary;
                fullName = i.fullName;
                dept = i.dept;
                id = i.id;
            }
        }
        System.out.println('\n' + "Сотрудник с максимальной ЗП: " + '\n' +
                fullName + " --- id: " + id + '\n' + "Отдел №" + dept + ", зарплата = " + maxSum);
    }

    public static void averageValueOfSalaries() {
        float sum = 0;
        int dept = 0;
        float averageValue = 0;
        for (Employee i : employee) {
            if (i == null) {
                break;
            }
            sum += i.salary;
            dept = i.dept;
            averageValue = sum / dept;
        }
        System.out.printf('\n' + "Средняя сумма на зарплаты: " + "%.2f",averageValue);
    }

    public static void listOfEmployees() {
        System.out.println('\n');
        System.out.println("Список сотрудников:");
        String fullName;
        for (Employee i : employee) {
            if (i == null) {
                break;
            }
            fullName = i.fullName;
            System.out.println("Сотрудник - " + fullName);
        }
    }

    public static void main(String[] args) {
        listOfAllEmployees();
        expensesPerMonth();
        minSalaryEmployee();
        maxSalaryEmployee();
        averageValueOfSalaries();
        listOfEmployees();
    }
}
