package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100000000);
        bankAccount.withdraw(100);

        System.out.println("balance = " + bankAccount.getBalance() );
    }
}
