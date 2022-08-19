import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Customer {


    public String name;
    public String lastName;
    public double deposit;
    public double withdraw;
    public double balance;
    LocalDateTime now = LocalDateTime.now();
    Scanner scanner = new Scanner(System.in);
    int errorNumber;


    public abstract void depositMoney(double deposit);

    public abstract void withdrawMoney(double withdraw);

    public abstract void transferMoney(double withdraw, double deposit);

    public void welcomeScreen() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formatDateTime = now.format(formatter);

        System.out.println("** Welcometo Citizens Bank **");
        System.out.println();
        System.out.println(formatDateTime);
        System.out.println();
        System.out.println("Please Enter Your Username");
        System.out.println();
        System.out.println("Please Enter Your Password");

    }
/*
    public Customer(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
    }

 */

}
