public class Main {

    public static void main(String[] args) {

        Account acc1 = new Account(101, "Vidhena", 5000);

        Bank bank = new Bank();

        bank.accountDetails(acc1);

        acc1.deposit(2000);

        acc1.withdraw(1000);

        acc1.displayBalance();
    }
}
