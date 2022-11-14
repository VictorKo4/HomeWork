package homeWork1.task3;

public class Person {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public void maxim() {
        this.name = "Максим";
        this.yearOfBirth = 1988;
        this.town = "Минск";
        this.jobTitle = "бренд-менеджер";
        if (yearOfBirth == 0) {
            yearOfBirth = 0;
        } else {
            yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null) {
            name = ":Информация не указана:";
        } else if (town == null) {
            town = ":Информация не указана:";
        } else if (jobTitle == null) {
            jobTitle = ":Информация не указана:";
        }
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
    public void anna() {
        this.name = "Аня";
        this.yearOfBirth = 1993;
        this.town = "Москва";
        this.jobTitle = "методист образовательных программ";
        if (yearOfBirth == 0) {
            yearOfBirth = 0;
        } else {
            yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null) {
            name = ":Информация не указана:";
        } else if (town == null) {
            town = ":Информация не указана:";
        } else if (jobTitle == null) {
            jobTitle = ":Информация не указана:";
        }
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
    public void kate() {
        this.name = "Катя";
        this.yearOfBirth = 1992;
        this.town = "Калининград";
        this.jobTitle = "продакт-менеджер";
        if (yearOfBirth == 0) {
            yearOfBirth = 0;
        } else {
            yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null) {
            name = ":Информация не указана:";
        } else if (town == null) {
            town = ":Информация не указана:";
        } else if (jobTitle == null) {
            jobTitle = ":Информация не указана:";
        }
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
    public void artem() {
        this.name = "Артем";
        this.yearOfBirth = 1995;
        this.town = "Москва";
        this.jobTitle = "директор по развитию бизнеса";
        if (yearOfBirth == 0) {
            yearOfBirth = 0;
        } else {
            yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null) {
            name = ":Информация не указана:";
        } else if (town == null) {
            town = ":Информация не указана:";
        } else if (jobTitle == null) {
            jobTitle = ":Информация не указана:";
        }
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

}
