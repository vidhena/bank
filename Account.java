public class Account {

    int accountNumber;
    String customerName;
    double balance;

    Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully");
    }

    void withdraw(double amount) {

        if(amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
