import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public abstract class Customer implements TransferMoney {


    public String name;
    public String lastName;
    public double deposit;
    public double withdraw;
    public double balance;
    LocalDateTime now = LocalDateTime.now();
    Scanner scanner = new Scanner(System.in);
    int errorNumber;
    double moneyAmount;


    public abstract void depositMoney(double deposit);

    public abstract void withdrawMoney(double withdraw);

    public abstract void transferMoney(double withdraw, double deposit);

    public abstract void menuScreen();

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

    public void currentBalance() {

        System.out.println(" Current Balance is " + balance);
    }

    public void gas(double gasWithdraw) {
        balance -= gasWithdraw;

        if (balance < gasWithdraw) {
            System.out.println("Transfer  amount is  less then balance");
            // System.exit(0);
        } else {
            System.out.println("New balance is " + balance);

        }
// toString
    }
}