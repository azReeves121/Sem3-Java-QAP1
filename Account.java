public class Account {

    private String id;  
    private String name; 
    private int balance; 

    // Constructor with ID and name, 
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor with ID, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for ID
    public String getId() {
        return id;
    }

    // Setter for ID
    public void setId(String id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Method to deposit money (credit)
    public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount to be credited should be positive");
        }
    }

    // Method to withdraw money (debit)
    public boolean debit(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Debit failed: insufficient balance or invalid amount");
            return false;
        }
    }

    // Method to transfer money to another account
    public boolean transferTo(Account targetAccount, int amount) {
        if (amount > 0 && amount <= balance) {
            this.debit(amount);  
            targetAccount.credit(amount);  
            return true;
        } else {
            System.out.println("Transfer failed: insufficient balance or invalid amount");
            return false;
        }
    }

    // toString method 
    public String toString() {
        return "Account[ID: " + id + ", Name: " + name + ", Balance: $" + balance + "]";
    }
}
