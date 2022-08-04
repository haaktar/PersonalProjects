package Inheritance.InheritancePractice;

public class ElectronicObjects {


    public static void main(String[] args) {

        TV tv = new TV("Motorola", "XL", 1234, "USA", true, true, 12.2, false);
        Phone phone = new Phone("Phone Band", "model iyi", 3123, true, true, "Andor");
        TV tv1 = new TV("sa", "aw", 12, "as", false, false, 32, false);
        System.out.println(phone);
        System.out.println(tv);
        System.out.println(tv1);
    }
}
