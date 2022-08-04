package Overriding.CarTest;

public class CarObjects {

    public static void main(String[] args) {

        Honda honda = new Honda();
        Mercedes mercedes = new Mercedes();
        Jeep jeep = new Jeep();
        Tesla tesla = new Tesla();

        honda.start();
        System.out.println("===========");
        tesla.start();
        System.out.println("===========");
        jeep.start();
        System.out.println("===========");
        mercedes.start();

    }


}
