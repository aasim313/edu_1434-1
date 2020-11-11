/* В нашей вселенной здоровье человека не может быть больше 100ед. */
public class Main {
    public static void main(String[] args) {
        /*int medKit = 50;
        Person alex = new Person("Алекс","Петров",40);
        Person ivan = new Person("Иван","Иванов",38);
        alex.sayHi("Жора");
        System.out.println("Гуляя по лесу, "+alex.getName()+" нарвался на волка");
        alex.setHp(-30);
        System.out.println("Здоровье Алекса "+alex.getHp());
        System.out.println("Алекс применил аптечку");
        alex.setHp(medKit);
        System.out.println("Здоровье Алекса "+alex.getHp());
        ivan.setHp(1000);
        System.out.println("Здоровте Ивана "+ ivan.getHp());*/

        Cat barsik = new Cat("Барсик");
        System.out.println("Уровень сытости "+barsik.getStomach());
        barsik.eat(99999999);
        System.out.println("Уровень сытости "+barsik.getStomach());
    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    private int hp;
    Person(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
    }
    String getName(){return this.name;}
    int getHp(){return this.hp;}
    void setHp(int value){
        if (this.hp + value>=100) this.hp = 100;
        else this.hp = this.hp + value;
    }
    void sayHi(String name){
        System.out.println("Привет "+name+", меня зовут "+this.name);
    }
}


class Cat {
    private int stomach;
    private String nickname;
    Cat(String nickname){
        this.nickname = nickname;
        this.stomach = 1;
    }
    int getStomach(){return this.stomach;}
    void eat(int value){
        if(this.stomach+value > 100) this.stomach = 100;
        else this.stomach = this.stomach + value;
    }
}
