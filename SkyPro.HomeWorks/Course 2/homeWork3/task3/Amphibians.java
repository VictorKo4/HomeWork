package homeWork3.task3;

public class Amphibians extends Animals{
    private String livingEnvironment;

    public Amphibians(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        this.livingEnvironment = livingEnvironment;
    }
    public Amphibians(){}

    public static void amphibians() {
        Amphibians[] amphibian = new Amphibians[10];
        amphibian[0] = new Amphibians("Лягушка", 2, "Земноводная");
        amphibian[1] = new Amphibians("Уж пресноводный", 1, "Земноводная");
        for (Amphibians list : amphibian) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

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

    @Override
    public String toString() {
        return '\n' + "Животное: " + '\'' + getNickname() + '\'' + '\n' +
                "Возраст: " + getAge() + " лет" + '\n' +
                "Класс: 'Земноводные'" + '\n' +
                "Среда обитания:" + '\'' + getLivingEnvironment() + '\'';
    }
}
