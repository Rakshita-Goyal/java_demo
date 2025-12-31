package oops;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private int balance = 5000;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
    }
}

public class Bank{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(7000); // trying to withdraw more than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
