import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person ann  = new Person("Анна","Сидирова",70, null,null);
        Person igor = new Person("Игорь","Сидоров",45,ann,null);
        Person olga = new Person("Ольга","Сидорова",42, null, null);
        Person alex = new Person("Алекс","Сидоров",16,olga,igor);
        alex.getInfo();
    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    private Person mother;
    private Person father;

    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }
    public void getInfo(){
        System.out.println( "Меня зовут: " + this.name + "\n" +
                            "Мне "+this.age + " лет \n"+
                            "Моя мама: "+this.getMother().getName()+"\n" +
                            "Мой папа: "+this.getFather().getName()+"\n"+
                            "Бабушка по папиной линии: "+ this.getFather().getMother().getName());
    }
}
