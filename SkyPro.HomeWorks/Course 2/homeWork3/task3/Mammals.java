package homeWork3.task3;

public class Mammals extends Animals{
    private String livingEnvironment;
    private int movementSpeed;

    public Mammals(String nickname, int age, String livingEnvironment, int movementSpeed) {
        super(nickname, age);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }
    public Mammals(){}

    @Override
    public void eat() {
        System.out.println("Кушать");
    }

    @Override
    public void move() {
        System.out.println("Перемещаться");
    }


    public static void walk() {
        System.out.println("Гулять");
    }

    public String getLivingEnvironment() {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            livingEnvironment = "Не указано";
        }
        return livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed <= 0) {
            movementSpeed = 1;
        }
        this.movementSpeed = movementSpeed;
    }

    public static class Herbivores extends Mammals {
        private String typeOfFood;

        public Herbivores(String nickname, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
            super(nickname, age, livingEnvironment, movementSpeed);
            this.typeOfFood = typeOfFood;
        }

        public static void Herbivores() {
            Herbivores[] herbivores = new Herbivores[10];
            herbivores[0] = new Herbivores("Газель", 5, "Полупустыня", 50, "Трава");
            herbivores[1] = new Herbivores("Жираф", 8, "Тропические степи", 55, "Листья");
            herbivores[2] = new Herbivores("Лошадь", 10, "",18, "Трава");
            for (Herbivores list : herbivores) {
                if (list != null) {
                    System.out.println(list);
                }
            }
        }

        public static void pasture() {
            System.out.println("Пастись");
        }

        public String getTypeOfFood() {
            return typeOfFood;
        }

        public void setTypeOfFood(String typeOfFood) {
            if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
                this.typeOfFood = typeOfFood;
            } else {
                this.typeOfFood = "Не указано";
            }
        }

        @Override
        public String toString() {
            return '\n' + "Животное: " + '\'' + getNickname() + '\'' + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: 'Млекопитающее', подкласс: 'Травоядное'" + '\n' +
                    "Тип пищи: " + '\'' + getTypeOfFood() + '\'' + '\n' +
                    "Среда обитания:" + '\'' + getLivingEnvironment() + '\'' + '\n' +
                    "Скорость перемещения: " + getMovementSpeed() + "км/ч";
        }

    }

    public static class Predators extends Mammals {
        private String typeOfFood;

        public Predators(String nickname, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
            super(nickname, age, livingEnvironment, movementSpeed);
            this.typeOfFood = typeOfFood;
        }

        public static void Predators() {
            Predators[] predator = new Predators[10];
            predator[0] = new Predators("Гиена", 4, "Саванна", 50, "Падаль");
            predator[1] = new Predators("Тигр", 6, "Полупустыня", 60, "Мясо");
            predator[2] = new Predators("Медведь", 12, "Лес", 50, "Всеядный");
            for (Predators list : predator) {
                if (list != null) {
                    System.out.println(list);
                }
            }
        }

        public static void hunting() {
            System.out.println("Охотится");
        }

        public String getTypeOfFood() {
            return typeOfFood;
        }

        public void setTypeOfFood(String typeOfFood) {
            if (typeOfFood != null && !typeOfFood.isEmpty() && typeOfFood.isBlank()) {
                this.typeOfFood = typeOfFood;
            } else {
                this.typeOfFood = "Не указано";
            }
        }

        @Override
        public String toString() {
            return '\n' + "Животное: " + '\'' + getNickname() + '\'' + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: 'Млекопитающее', подкласс: 'Хищное'" + '\n' +
                    "Тип пищи: " + '\'' + getTypeOfFood() + '\'' + '\n' +
                    "Среда обитания:" + '\'' + getLivingEnvironment() + '\'' + '\n' +
                    "Скорость перемещения: " + getMovementSpeed() + "км/ч";
        }
    }
}
