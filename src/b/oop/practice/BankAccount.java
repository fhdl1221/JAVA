package b.oop.practice;

public class BankAccount {
    String accountNumber;
    int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.print("입금 " + amount + "원, " + "잔액: " + this.balance + "원");
    }

    public void withdraw(int amount) {
        if(balance >= amount) {
            this.balance -= amount;
            System.out.print("출금 " + amount + "원, " + "잔액: " + this.balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void getBalance() {
        System.out.print("잔액: " + this.balance + "원");
    }
}
