package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public 메서드  : deposit
    public void deposit(int amount){
        if(isAmountValid(amount)) {
            balance += amount;
        }else{
            System.out.println("정상 금액이 아님.");
        }
    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >=0){
            balance -= amount;
        }else {
            System.out.println("잔액이 부족하거나 정상 금액이 아님");
        }
    }

    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount){
        return amount>0;
    }



}
