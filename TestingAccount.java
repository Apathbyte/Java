public class TestingAccount {
    public static void main(String[] args) {
        //lets create an account with id 1234 with default balance of $ 100 and IR of 6.7%
        Account account = new Account(1234, 100);
        account.setAnnualInterestRate(6.7);

        account.withdraw(101); // Insufficient balance to withdraw
        account.withdraw(50); 
        account.deposit(1000);
        
        System.out.println();
        System.out.println("******ACCOUNT DETAILS******");
        System.out.println();
        System.out.println("Account Number: " + account.getId());
        System.out.println("Balance Available: " + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}

