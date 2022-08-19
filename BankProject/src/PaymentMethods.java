import java.time.format.DateTimeFormatter;

public class PaymentMethods extends Customer {

    double balance;
    String username = "hakan";
    String userPassword = "123";
    int errorNumber = 0;


    public PaymentMethods(String name, String lastName) {


    }

    @Override
    public void welcomeScreen() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formatDateTime = now.format(formatter);

        System.out.println("=========================");
        System.out.println("** Welcome to Citizens Bank **");
        System.out.println("    " + formatDateTime);
        System.out.println("=========================");
        System.out.println();

    }

    public void loginScreen() {

        System.out.println("Please Enter Your Username");
        System.out.print("Username : ");
        String userNameScanner = scanner.next();
        System.out.println("Please Enter Your Password");
        System.out.print("Password: ");
        String userPasswordScanner = scanner.next();

        if ((username.equalsIgnoreCase(userNameScanner)) && (userPassword.equalsIgnoreCase(userPasswordScanner))) {

            System.out.println();
            System.out.println("=========================");
            System.out.println("*** Log in Successful ***");
            System.out.println("=========================");


        } else {

            for (; ; ) {
                ++errorNumber;

                System.err.println("Wrong Username or Password");
                System.out.println("Please Enter Your Username");
                System.out.print("Username : ");
                String userNameScanner2 = scanner.next();
                System.out.println("Please Enter Your Password");
                System.out.print("Password: ");
                String userPasswordScanner2 = scanner.next();
                if (errorNumber == 2) {
                    System.err.println("Session is Terminated");
                    System.exit(0);
                }

                if ((username.equalsIgnoreCase(userNameScanner2)) && (userPassword.equalsIgnoreCase(userPasswordScanner2))) {
                    System.out.println();
                    System.out.println("=========================");
                    System.out.println("*** Log in Successful ***");
                    System.out.println("=========================");

                    return;
                }

            }
        }
    }

    @Override
    public void depositMoney(double deposit) {

        this.deposit = deposit;
        balance += deposit;

        if (deposit <= 0) {
            throw new RuntimeException("Amount must be above $0 ");
        }

        System.out.println(" New balance is " + balance);

    }

    @Override
    public void withdrawMoney(double withdraw) {

        this.withdraw = withdraw;
        balance -= withdraw;

        if (balance < withdraw) {
            System.out.println("Withdraw  amount is  less then balance");
            System.exit(0);
        }

    }

    @Override
    public void transferMoney(double deposit, double withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;


    }

    @Override
    public String toString() {
        return "PaymentMethods{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", deposit=" + deposit + ", withdraw=" + withdraw + ", balance=" + balance + '}';
    }
}
