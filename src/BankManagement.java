import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Taking Customer Details

        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();


        Customer customer = new Customer(id, name);

        System.out.println("\nCustomer Registered Successfully");


        // Taking Account Details

        System.out.print("\nEnter Account Number: ");
        int accNo = sc.nextInt();

        sc.nextLine(); // clearing buffer


        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();


        System.out.print("Enter Opening Balance: ");
        double balance = sc.nextDouble();


        Account account;


        // Creating account based on type

        if(type.equalsIgnoreCase("Savings")) {

            account = new Savings_Account(
                    accNo,
                    balance,
                    customer
            );

        }
        else if(type.equalsIgnoreCase("Current")) {

            account = new Current_Account(
                    accNo,
                    balance,
                    customer
            );

        }
        else if(type.equalsIgnoreCase("Fixed")) {

            System.out.print("Enter Lock Period: ");
            int years = sc.nextInt();

            account = new FixedDepositAccount(
                    accNo,
                    balance,
                    customer,
                    years
            );

        }
        else {

            System.out.println("Invalid Account Type");
            return;
        }


        System.out.println("\nAccount Created Successfully");


        // Deposit

        System.out.print("\nEnter Deposit Amount: ");
        double depositAmount = sc.nextDouble();


        account.deposit(depositAmount);


        System.out.println(
                "Updated Balance : "
                        + account.getBalance()
        );


        // Withdrawal

        System.out.print("\nEnter Withdrawal Amount: ");
        double withdrawAmount = sc.nextDouble();


        try {

            account.withdraw(withdrawAmount);

            System.out.println(
                    "Updated Balance : "
                            + account.getBalance()
            );

        }
        catch(Exception e) {

            System.out.println(e.getMessage());

        }


        // Interest

        double interest = account.calculateInterest();

        System.out.println(
                "\nInterest Calculated Successfully"
        );

        System.out.println(
                "Yearly Interest : "
                        + interest
        );


        // Display Details

        System.out.println("\nAccount Details");
        System.out.println("----------------");

        System.out.println(account);


        // Search Account

        System.out.print(
                "\nEnter Account Number to Search: "
        );

        int search = sc.nextInt();


        if(account.getAccountNumber() == search) {

            System.out.println(
                    "Account Found Successfully"
            );

        }
        else {

            System.out.println(
                    "Account Not Found"
            );
        }


        // Receipt

        System.out.println("\n----------------");
        System.out.println("ABC BANK");
        System.out.println("Transaction Receipt");
        System.out.println("----------------");


        System.out.println(
                "Customer : "
                        + customer.getCustomerName()
        );

        System.out.println(
                "Account Number : "
                        + account.getAccountNumber()
        );

        System.out.println(
                "Balance : "
                        + account.getBalance()
        );


        sc.close();
    }
}