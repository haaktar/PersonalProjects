package Overriding.PetPractice;

public class Cat extends Pet {

    public Cat(String name, int age, char gender, String breed, String color) {
        super(name, age, gender, breed, color);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
