package Overriding.PetPractice;

public class Pet {

    public String name;
    public int age;
    public char gender;
    public String breed;
    public String color;


    public Pet(String name, int age, char gender, String breed, String color) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.color = color;


    }

    protected void eat(){

        System.out.println(name + " eating");


    }

    protected void drink(){

        System.out.println( name + " drinking");
    }

    protected void sleep(){

        System.out.println(name + " eating");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
