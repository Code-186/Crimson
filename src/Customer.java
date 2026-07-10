public class Customer {

    // Private data members (Encapsulation)
    private String customerId;
    private String customerName;

    // Default Constructor
    public Customer() {

    }

    // Parameterized Constructor
    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    // Getter for Customer ID
    public String getCustomerId() {
        return customerId;
    }

    // Setter for Customer ID
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // Getter for Customer Name
    public String getCustomerName() {
        return customerName;
    }

    // Setter for Customer Name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Display Customer Details
    @Override
    public String toString() {
        return "Customer ID : " + customerId +
                "\nCustomer Name : " + customerName;
    }
}