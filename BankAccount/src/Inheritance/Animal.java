package Inheritance;

public class Animal {

    public String name;
    public String size;
    public int age;
    public char gender;


    public void setInfo(String name, String size, int age, char gender) {

        this.name = name;
        this.size = size;
        this.age = age;
        this.gender = gender;

    }



    public void eat() {

        System.out.println(name + "Eating");
    }

    public void sleep() {

        System.out.println(name + "Sleeping");
    }
}
