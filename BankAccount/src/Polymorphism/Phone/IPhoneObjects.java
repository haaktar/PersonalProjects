package Polymorphism.Phone;

public class IPhoneObjects {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("Max", 1100, "12 Inch");
        Samsung samsung = new Samsung("H Model", 1000, "7 Inch");
        System.out.println(iPhone);

        Phone phone = new IPhone("Economy", 700, "6 inch");

    }
}
