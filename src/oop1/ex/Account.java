package oop1.ex;

public class Account {

    int balance;


    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }else {
            System.out.println("잔액부족");
        }
    }
/*
    void withdraw(int amount){
        balance -= amount;
        if(balance < 0){
            System.out.println("잔액부족");
        }else {
            System.out.println("현재 잔액 : " + balance);
        }
    }
*/
}
