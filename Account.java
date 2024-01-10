import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    // lets create a no-arg constructor
    public Account() {
        dateCreated = new Date(); // let us initialize the dateCreated attribute with the current date and time
    }

    // lets create a constructor with id and balance
    public Account(int id, double balance) {
        this.id = id;             /*Lets initialize the id, balance and date attribute 
                                with provided id, balance and current date-time repectively. */
        this.balance = balance;   
        dateCreated = new Date(); 
    }

    // creating an Accesor method for id
    public int getId() {
        return id;
    }

    // creating a mutator method for id
    public void setId(int id) {
        this.id = id;
    }

    // Accesor method for balance
    public double getBalance() {
        return balance;
    }

    // Mutator method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Accesor method for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Mutator method for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Accesor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to calculate and return the monthly interest rate on the deposit
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // lets create a method that withdraws the specified amount from the account balance
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("$ "+ amount +" cannot be withdrwan due to insufficient balance in account number: " + id);
        } else {
            balance -= amount;
            System.out.println("$ " + amount + " withdrwan successfully from account number: " + id);
        }
    }

    // lets create a method taht deposits the specified amount into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$ " + amount + " successfully deposited to account number: " + id);
    }
}
