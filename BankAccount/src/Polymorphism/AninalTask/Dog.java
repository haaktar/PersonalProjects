package Polymorphism.AninalTask;

public class Dog extends Animal {

    public String dogName;

    public Dog(String dogName, int age, char gender) {
        super(age, gender);
        this.dogName = dogName;
    }

    public void bark(){

        System.out.println(dogName + " barks");
    }

    @Override
    public void eat() {
        System.out.println(dogName+ " eating");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", gender=" + gender +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
