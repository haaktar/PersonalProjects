import java.time.format.DateTimeFormatter;

public class PaymentMethods extends Customer {

    double balance;
    // String username = "Hakan";
    //String userPassword = "123";
    // int errorNumber = 0;
    int creditScore;


    public PaymentMethods(String name, String lastName) {

    }

    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
            sleep();
            System.out.println();
            System.out.println("=========================");
            System.out.println("*** Account Is Loading ***");
            System.out.println("=========================");
            System.out.println();
            System.out.print("*");
            sleep();
            System.out.print("*");
            sleep();
            System.out.print("*");
            sleep();
            System.out.print("*");

            System.out.println();

            sleep();
/*
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

 */


        } else {

            for (; ; ) {
                ++errorNumber;

                System.err.println("Wrong Username or Password");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    return;
                }

            }
        }
    }

    @Override
    public void menuScreen() {

        for (; ; ) {


            System.out.println();
            System.out.println(username + " Please Select an Option");
            System.out.println();
            System.out.println("1 - Deposit Money " + " 2 - Withdraw Money " + " 3 - Utility Payments " + " 4- Balance " + "5 - Exit" + " 6 - Loan");

            int menuScanner = scanner.nextInt();

            if (menuScanner == 1) {

                System.out.println("Please Enter the Dollar Amount");

                double depositScanner = scanner.nextDouble();

                depositMoney(depositScanner);

            } else if (menuScanner == 2) {
                System.out.println("2 selected");

                System.out.println("Please Enter the Dollar Amount");

                double withdrawScanner = scanner.nextDouble();
                withdrawMoney(withdrawScanner);

            } else if (menuScanner == 3) {

                System.out.println("3 selected");

                System.out.println("Please Enter the Dollar Amount You Want To Transfer To National Fuel");

                double gasScanner = scanner.nextDouble();

                gas(gasScanner);

            } else if (menuScanner == 4) {

                currentBalance();

            } else if (menuScanner == 5) {

                System.out.println("");
                System.err.println("Successfully Logged Out");
                return;


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

        System.out.println("New balance is " + balance);

    }

    @Override
    public void withdrawMoney(double withdraw) {

        this.withdraw = withdraw;
        balance -= withdraw;

        if (balance < withdraw) {
            System.out.println("Withdraw  amount is  less then balance");
            // System.exit(0);
        } else {
            System.out.println("New balance is " + balance);

        }

    }

    @Override
    public void transferMoney(double deposit, double withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;

    }


    public void currentBalance() {

        System.out.println(" Current Balance is " + balance);

    }

    @Override
    public void gas(double gasWithdraw) {

        balance -= gasWithdraw;

        if (balance < gasWithdraw) {
            System.out.println("Transfer  amount is  less then balance");
            // System.exit(0);
        } else {
            System.out.println("New balance is " + balance);


        }
    }


}
