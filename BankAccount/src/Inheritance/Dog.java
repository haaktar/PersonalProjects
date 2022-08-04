package Inheritance;

public class Dog extends Animal {

    public Dog(String name, String size, int age, char gender) {


    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
