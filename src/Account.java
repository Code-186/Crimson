public abstract class Account implements BankOperations {

    public static final String BANK_NAME = "ABC Bank";

    private int accountNumber;
    private double balance;

    protected Customer customer;


    public Account(int accountNumber, double balance, Customer customer) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Customer getCustomer() {
        return customer;
    }



    @Override
    public void deposit(double amount) {

        if(amount <= 0) {

            throw new IllegalArgumentException(
                    "Invalid Deposit Amount"
            );
        }

        balance = balance + amount;

        System.out.println("Deposit Successful");
    }



    // Method Overloading
    public void deposit(double amount, String message) {

        deposit(amount);

        System.out.println("Message : " + message);
    }



    @Override
    public void checkBalance() {

        System.out.println(
                "Balance : " + balance
        );
    }



    public abstract void withdraw(double amount)
            throws InsufficientBalance;



    public abstract double calculateInterest();



    @Override
    public String toString() {

        return "Bank Name : " + BANK_NAME +
                "\n" + customer +
                "\nAccount Number : " + accountNumber +
                "\nBalance : " + balance;
    }
}