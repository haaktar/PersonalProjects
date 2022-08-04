package Overriding.PetPractice;

public class Dog extends Pet {



    public Dog(String name, int age, char gender, String breed, String color) {
        super(name, age, gender, breed, color);

    }

    @Override
    protected void eat() {
        super.eat();
    }

    @Override
    protected void drink() {
        super.drink();
    }

    @Override
    protected void sleep() {
        super.sleep();
    }
}
