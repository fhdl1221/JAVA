package b.oop.practice;

public class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public int accelerate() {
        this.speed += 10;
        return this.speed;
    }

    public int brake() {
        this.speed -= 10;
        return this.speed;
    }

    public void printInfo() {
        System.out.print("모델: " + this.model + ", 속도: " + this.speed + "km/h");
    }
}
