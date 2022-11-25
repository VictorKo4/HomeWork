package homeWork3.task3;

import java.util.Objects;

public abstract class Animals {
    private String nickname;
    private int age;

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
    public Animals(){}

    public abstract void eat();

    public static void sleep() {
        System.out.println("Спать");
    }

    public abstract void move();

    public String getNickname() {
        if (nickname == null || nickname.isEmpty() || nickname.isBlank()) {
            nickname = "Не указано";
        }
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            age = 1;
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return nickname.equals(animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
