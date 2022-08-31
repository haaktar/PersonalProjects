import java.util.Scanner;

public class TransferMethods extends PaymentMethods implements TransferMoney {






    public TransferMethods(String name, String lastName) {
        super(name, lastName);
    }


    public static void zelle(double balance,double withdraw) {


        System.out.println(" Please Enter Receiver's name : ");
        System.out.println(" Please Enter the amount: ");
        balance -= withdraw;

        if (balance < withdraw) {
            System.out.println("Withdraw  amount is  less then balance");
            System.exit(0);
        }


    }

    @Override
    public void gas() {

    }
}
