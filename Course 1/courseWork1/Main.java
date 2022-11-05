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
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    public static void expensesPerMonth() {
        System.out.println();
        float sum = 0;
        for (Employee i : employee) {
            if (i != null) {
                sum += i.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты: " + sum);
    }

    public static void minSalaryEmployee() {
        Employee employeeWithMinSalary = null;
        for (Employee i : employee) {
            if (i != null) {
                if (employeeWithMinSalary == null || i.getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = i;
                }
            }
        }
        System.out.println('\n' + "Сотрудник с минимальной ЗП: " + employeeWithMinSalary);
    }

    public static void maxSalaryEmployee() {
        Employee employeeWithMaxSalary = null;
        for (Employee i : employee) {
            if (i != null) {
                if (employeeWithMaxSalary == null || i.getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = i;
                }
            }
        }
        System.out.println('\n' + "Сотрудник с максимальной ЗП: " + employeeWithMaxSalary);
    }

    public static void averageValueOfSalaries() {
        float sum = 0;
        int dept = 0;
        for (Employee i : employee) {
            if (i != null) {
                sum += i.getSalary();
                dept = i.getDept();
            }
        }
        System.out.printf('\n' + "Средняя сумма на зарплаты: " + "%.2f",sum / dept);
    }

    public static void listOfEmployees() {
        System.out.println('\n');
        System.out.println("Список сотрудников:");
        String fullName;
        for (Employee i : employee) {
            if (i != null) {
                fullName = i.getFullName();
                System.out.println("Сотрудник - " + fullName);
            }
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
