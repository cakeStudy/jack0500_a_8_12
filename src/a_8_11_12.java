public class a_8_11_12
{
    /*Suppose the following BankAccount class has been created:
        1 // Each BankAccount object represents one user's account
        2 // information including name and balance of money.
        3 public class BankAccount {
        4 String name;
        5 double balance;
        6
        7 public void deposit(double amount) {
        8 balance = balance + amount;
        9 }
        10
        11 public void withdraw(double amount) {
        12 balance = balance - amount;
        13 }
        14 }
    Add a field to the BankAccount class named transactionFee for a real number representing an amount of money
    to deduct every time the user withdraws money. The default value is $0.00, but the client can change the value.
    Deduct the transaction fee money during every withdraw call (but not from deposits). Make sure that the balance
    cannot go negative during a withdrawal. If the withdrawal (amount plus transaction fee) would cause it to become
    negative, don’t modify the balance at all.*/

    /*Add a toString method to the BankAccount class from the previous exercise. Your method should return a string that
    contains the account's name and balance separated by a comma and space. For example, if an account object named yana
    has the name "Yana" and a balance of 3.03, the call yana.toString() should return the string "Yana, $3.03".*/

    // Each BankAccount object represents one user's account
    // information including name and balance of money.
    public class BankAccount
    {
        double transactionFee = 0.00;
        String name;
        double balance;

        public void deposit(double amount)
        {
          balance = balance + amount;
        }

        public void withdraw(double amount, double setTransactionFee)
        {
            if (balance >= (amount+transactionFee) && amount >= 0.0 && transactionFee >= 0.0)
            {
                transactionFee = setTransactionFee;
                balance = (balance - amount) - transactionFee;
                System.out.println("successful withdraw");
            }
            else
            {
                System.out.println("Your withdraw met a mistake, try again");
            }
        }

        public String toString()
        {
            return name+ ", $" + balance;
        }
    }
}
