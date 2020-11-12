import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик","Дворняга",4,"Иван");
        barsik.voice();
        Dog bobik = new Dog("Бобик","Дворняга",4);
        bobik.voice();
        System.out.println(bobik.getNickname());
        Horse mustang = new Horse("Мустанг","Рысак",4);
        mustang.voice();
    }
}

interface AnimalInterface{
    public void voice();
}

abstract class Animal implements AnimalInterface{
    private String nickname;
    private String breed;
    private int age;

    public Animal(String nickname, String breed, int age) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }
}

class Cat extends Animal{
    private String owner;
    public Cat(String nickname, String breed, int age, String owner) {
        super(nickname, breed, age);
        this.owner = owner;
    }

    @Override
    public void voice(){
        System.out.println("MEOW MEOW MEOW");
    }
}

class Dog extends Animal{
    public Dog(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }

    @Override
    public void voice(){
        System.out.println("Woof woof woof");
    }
}

class Horse extends Animal{
    public Horse(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }

    @Override
    public void voice() {
        System.out.println("igogo");
    }
}
