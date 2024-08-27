
package AmigoCode;

class BankAccount
{
    static int totalAccounts = 0;	// Static variable to count total accounts

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder; this.balance = balance; totalAccounts++;
    }

    void displayAccountDetails()
    {
        System.out.println("Account Holder: " + accountHolder); System.out.println("Balance: " + balance);
    }

    static void displayTotalAccounts()	//static method definition
    {
        System.out.println("Total bank accounts created: " + totalAccounts);
    }
}



class StaticBankAccount
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount("Anand", 1500.00); BankAccount account2 = new BankAccount("Arun", 2500.00);

        account1.displayAccountDetails(); account2.displayAccountDetails();

        BankAccount.displayTotalAccounts(); // Display total accounts using static method
    }
}

