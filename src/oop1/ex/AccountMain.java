package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        //1만원 입금
        account.deposit(10000);

        //5천원 출금
        account.withdraw(9000);
        //5천원 출금
        account.withdraw(2000); // 잔액부족
        System.out.println(" 잔고 : " +account.balance);

    }
}
