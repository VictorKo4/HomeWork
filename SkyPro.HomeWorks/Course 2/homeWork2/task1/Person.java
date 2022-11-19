package homeWork2.task1;

public class Person {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public void maxim() {
        this.name = "Максим";
        this.yearOfBirth = 1988;
        this.town = "Минск";
        this.jobTitle = "бренд-менеджер";

        if (name == null || name.isEmpty() || name.isBlank()) {
            name = ":Информация не указана:";
        } else if (town == null || town.isEmpty() || town.isBlank()) {
            town = ":Информация не указана:";
        } else if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
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

        if (name == null || name.isEmpty() || name.isBlank()) {
            name = ":Информация не указана:";
        } else if (town == null || town.isEmpty() || town.isBlank()) {
            town = ":Информация не указана:";
        } else if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
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

        if (name == null || name.isEmpty() || name.isBlank()) {
            name = ":Информация не указана:";
        } else if (town == null || town.isEmpty() || town.isBlank()) {
            town = ":Информация не указана:";
        } else if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
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

        if (name == null || name.isEmpty() || name.isBlank()) {
            name = ":Информация не указана:";
        } else if (town == null || town.isEmpty() || town.isBlank()) {
            town = ":Информация не указана:";
        } else if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            jobTitle = ":Информация не указана:";
        }
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

    public void vladimir() {
        this.name = "Владимир";
        this.yearOfBirth = 2001;
        this.town = "Казань";
        this.jobTitle = null;

        if (name == null || name.isEmpty() || name.isBlank()) {
            name = ":Информация не указана:";
        } else if (town == null || town.isEmpty() || town.isBlank()) {
            town = ":Информация не указана:";
        } else if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            jobTitle = ":Информация не указана:";
        }
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        } else {
            this.town = ":Информация не указана:";
        }
    }
}
