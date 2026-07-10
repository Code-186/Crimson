public class Current_Account extends Account {


    public Current_Account(int accountNumber,
                           double balance,
                           Customer customer) {

        super(accountNumber, balance, customer);
    }



    @Override
    public void withdraw(double amount)
            throws InsufficientBalance {


        if(amount <= 0) {

            throw new IllegalArgumentException(
                    "Invalid Withdrawal Amount"
            );
        }



        if(amount > getBalance()) {

            throw new InsufficientBalance(
                    "Insufficient Balance"
            );
        }



        setBalance(
                getBalance() - amount
        );


        System.out.println(
                "Withdrawal Successful"
        );
    }



    @Override
    public double calculateInterest() {

        return getBalance() * 0.02;
    }



    @Override
    public String toString() {

        return super.toString()
                + "\nAccount Type : Current"
                + "\nInterest : "
                + calculateInterest();
    }
}