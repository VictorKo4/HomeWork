package courseWork1;

public class Employee {

    String firstName;
    String middleName;
    String lastName;
    String fullName;
    int dept;
    float salary;
    static int counter;
    int id;


    public Employee(String lastName, String firstName, String middleName, float salary, int dept) {
        this.salary = salary;
        this.dept = dept;
        this.id = ++counter;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = lastName + " " + firstName + " " + middleName;
    }

    @Override
    public String toString() {
        return '\n' + "Сотрудник - id: " + id + '\n' +
                "ФИО: " + fullName + '\n' +
                "Отдел: " + dept + '\n' +
                "Зарплата: " + salary + '\n' +
                "_________________";
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDept() {
        return this.dept;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }
}

