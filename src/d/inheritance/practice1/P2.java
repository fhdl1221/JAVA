package d.inheritance.practice1;

class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

class SavingAccount extends Account {
    double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }
}

class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if(amount > 0 && amount <= (overdraftLimit + balance)) {
            balance -= amount;
        } else {
            System.out.println("마이너스 한도 초과입니다.");
        }
    }
}
public class P2 {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount("SA001", 1000000, 0.03);
        savings.deposit(500000);
        savings.addInterest();
        System.out.println("저축예금 잔액: " + savings.balance);

        CheckingAccount checking = new CheckingAccount("CA001", 100000, 500000);
        checking.withdraw(5000);
        System.out.println("입출금예금 잔액: " + checking.balance);
    }
}
