public interface BankOperations {

    void deposit(double amount);

    void withdraw(double amount) throws InsufficientBalance;

    void checkBalance();
}