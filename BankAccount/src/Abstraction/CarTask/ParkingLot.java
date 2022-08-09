package Abstraction.CarTask;

public class ParkingLot {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();

        bmw.start();
        tesla.start();
        toyota.start();

    }




}
