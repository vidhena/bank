public class Bank {

    public void accountDetails(Account acc) {

        System.out.println("Account Number : " + acc.accountNumber);
        System.out.println("Customer Name  : " + acc.customerName);

        acc.displayBalance();
    }
}
