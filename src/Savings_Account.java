public class Savings_Account extends Account {


    // Final variable (minimum balance cannot be changed)
    private final double MIN_BALANCE = 1000;


    // Constructor
    public Savings_Account(int accountNumber,
                           double balance,
                           Customer customer) {

        super(accountNumber, balance, customer);
    }



    // Override withdraw() method
    @Override
    public void withdraw(double amount)
            throws InsufficientBalance {


        if(amount <= 0) {

            throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero."
            );
        }



        if((getBalance() - amount) < MIN_BALANCE) {

            throw new InsufficientBalance(
                    "Cannot withdraw. Minimum balance of ₹1000 must be maintained."
            );
        }



        setBalance(
                getBalance() - amount
        );


        System.out.println(
                "Withdrawal Successful"
        );
    }



    // Override calculateInterest()
    @Override
    public double calculateInterest() {

        return getBalance() * 0.04;
    }



    // Override toString()
    @Override
    public String toString() {

        return super.toString()
                + "\nAccount Type : Savings"
                + "\nMinimum Balance : " + MIN_BALANCE
                + "\nYearly Interest : " + calculateInterest();
    }
}