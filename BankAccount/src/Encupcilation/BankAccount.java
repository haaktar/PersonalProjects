package Encupcilation;

public class BankAccount {

    public static String bankName;
    public String name;
    public String lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;


    public BankAccount(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;

        System.out.println("Depositing " + depositAmount);

    }

    public void withdraw(double withdrawAmount) {

        if (balance < withdrawAmount) {
            System.out.println("Insuffcicant Blance");
            return;
        } else {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawing " + withdrawAmount);

        }


        System.out.println("Balance " + balance);


    }

}
