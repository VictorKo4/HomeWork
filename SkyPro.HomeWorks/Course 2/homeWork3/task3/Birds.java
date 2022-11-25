package homeWork3.task3;

public class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        this.livingEnvironment = livingEnvironment;
    }
    public Birds(){}

    @Override
    public void eat() {
        System.out.println("Кушать");
    }

    @Override
    public void move() {
        System.out.println("Перемещаться");
    }

    public static void hunting() {
        System.out.println("Охотится");
    }

    public String getLivingEnvironment() {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            livingEnvironment = "Не указано";
        }
        return livingEnvironment;
    }

    public static class Flightless extends Birds {
        private String typeOfMovement;

        public Flightless(String nickname, int age, String livingEnvironment, String typeOfMovement) {
            super(nickname, age, livingEnvironment);
            this.typeOfMovement = typeOfMovement;
        }
        public static void Flightless() {
            Flightless[] flightless = new Flightless[10];
            flightless[0] = new Flightless("Павлин", 3, "", "По земле");
            flightless[1] = new Flightless("Пингвин", 4, "Антарктика", "По земле и воде");
            flightless[2] = new Flightless("Додо", 2, "","");
            for (Flightless list : flightless) {
                if (list != null) {
                    System.out.println(list);
                }
            }
        }
        public static void walk() {
            System.out.println("Гулять");
        }

        public String getTypeOfMovement() {
            if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
                typeOfMovement = "Не указано";
            }
            return typeOfMovement;
        }
        @Override
        public String toString() {
            return '\n' + "Животное: " + '\'' + getNickname() + '\'' + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: 'Птицы', подкласс: 'Нелетающие'" + '\n' +
                    "Среда обитания:" + '\'' + getLivingEnvironment() + '\'' + '\n' +
                    "Тип передвижения: " + '\'' + getTypeOfMovement() + '\'';
        }
    }

    public static class Flying extends Birds {
        private String typeOfMovement;

        public Flying(String nickname, int age, String livingEnvironment, String typeOfMovement) {
            super(nickname, age, livingEnvironment);
            this.typeOfMovement = typeOfMovement;
        }

        public static void Flying() {
            Flying[] flying = new Flying[10];
            flying[0] = new Flying("Чайка", 5, "Море", "Воздух");
            flying[1] = new Flying("Альбатрос", 2, "Воды Антарктиды", "Вода-воздух");
            flying[2] = new Flying("Сокол", 3, "Тропики", "Воздух");
            for (Flying list : flying) {
                if (list != null) {
                    System.out.println(list);
                }
            }
        }

        public static void Fly() {
            System.out.println("Летать");
        }

        public String getTypeOfMovement() {
            if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) {
                typeOfMovement = "Не указано";
            }
            return typeOfMovement;
        }
        @Override
        public String toString() {
            return '\n' + "Животное: " + '\'' + getNickname() + '\'' + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: 'Птицы', подкласс: 'Летающие'" + '\n' +
                    "Среда обитания:" + '\'' + getLivingEnvironment() + '\'' + '\n' +
                    "Тип передвижения: " + '\'' + getTypeOfMovement() + '\'';
        }
    }
}
