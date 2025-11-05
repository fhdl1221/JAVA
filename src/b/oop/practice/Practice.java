package b.oop.practice;

public class Practice {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        person.printInfo();

        System.out.println();

        Dog dog = new Dog("진돗개", "백구");
        dog.sit();
        System.out.println();
        dog.hand();

        System.out.println();

        Car car = new Car("Avante", 0);
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.printInfo();

        System.out.println();

        BankAccount bk = new BankAccount("첫 계좌", 0);
        bk.deposit(10000);
        System.out.println();
        bk.withdraw(3000);
        System.out.println();
        bk.getBalance();

        System.out.println();

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.getCount();
        System.out.println();

        counter.decrement();
        counter.getCount();
        System.out.println();

        counter.reset();
        counter.getCount();
    }
}
