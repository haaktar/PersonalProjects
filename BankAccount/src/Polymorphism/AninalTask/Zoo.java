package Polymorphism.AninalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Joay", 3, 'F');
        Animal dog2 = new Dog("Katil",4,'M');

        dog1.sleep();
        dog1.eat();
        dog1.bark();

        System.out.println("=================");

        dog2.eat();
        dog2.sleep();
    }
}
