package Polymorphism.AninalTask;

import Polymorphism.Phone.IPhone;
import Polymorphism.Phone.Phone;
import Polymorphism.Phone.Samsung;

public class TypeCasting {

    public static void main(String[] args) {
        Dog dog1 = new Dog("A", 12, 'F');
        Cat cat1 = new Cat("B", 3, 'M');

        Animal animal1 = dog1;
        Animal animal2 = cat1;

        System.out.println("==================================");

        int a = 500;
        byte b = (byte) a;

        Animal animal3 = new Dog("A", 12, 'F');
        //animal3.bark();

        Dog dog2 = (Dog) animal3;
        dog2.bark();


        Phone phone1 = new IPhone("Model", 1000, "22");
        Phone phone2 = phone1;
        Phone phone3 = new Samsung("Model", 1000, "33");
        Samsung phone4 = (Samsung) phone3;


    }
}
