public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts using parameterized constructors
        Account acc1 = new Account("ACC1", "Kassim", 5000);
        Account acc2 = new Account("ACC2", "Reeves", 4000);

        // Display the balance of both accounts using getBalance() method
        System.out.println("Balance of Account 1: $" + acc1.getBalance());
        System.out.println("Balance of Account 2: $" + acc2.getBalance());

        // Transfer $1000.00 from account 1 to account 2
        boolean transferStatus = acc1.transferTo(acc2, 1000);
        if (transferStatus) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed.");
        }

        // Display the balance of both accounts again after the transfer
        System.out.println("Balance of Account 1 after transfer: $" + acc1.getBalance());
        System.out.println("Balance of Account 2 after transfer: $" + acc2.getBalance());
    }
}
