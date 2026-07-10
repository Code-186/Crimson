public class FixedDepositAccount extends Account {

    // Additional attribute
    private int lockPeriod;   // in years

    // Constructor
    public FixedDepositAccount(int accountNumber, double balance,
                               Customer customer, int lockPeriod) {

        super(accountNumber, balance, customer);
        this.lockPeriod = lockPeriod;
    }

    // Getter
    public int getLockPeriod() {
        return lockPeriod;
    }

    // Setter
    public void setLockPeriod(int lockPeriod) {
        this.lockPeriod = lockPeriod;
    }

    // Override withdraw()
    @Override
    public void withdraw(double amount) {

        throw new IllegalArgumentException(
                "Premature withdrawal is not allowed for Fixed Deposit Account.");
    }

    // Override calculateInterest()
    @Override
    public double calculateInterest() {

        return getBalance() * 0.07;   // 7% yearly interest
    }

    // Override toString()
    @Override
    public String toString() {

        return super.toString() +
                "\nAccount Type : Fixed Deposit" +
                "\nLock Period : " + lockPeriod + " years" +
                "\nYearly Interest : " + calculateInterest();
    }
}