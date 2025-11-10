package d.inheritance.practice1;

class Vehicle {
    String model;
    double dailyRate;

    public Vehicle(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Car extends Vehicle {
    boolean hasGPS;

    public Car(String model, double dailyRate, boolean hasGPS) {
        super(model, dailyRate);
        this.hasGPS = hasGPS;
    }

    @Override
    double calculateRentalCost(int days) {
        double total = 0;
        if(hasGPS) {
            total = days * (dailyRate + 10000);
        }
        return total; // hasGPS가 false면 0이 반환됨
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", dailyRate=" + (int)dailyRate + ", hasGPS=" + hasGPS + '}';
    }
}

class Truck extends Vehicle {
    double capacity;

    public Truck(String model, double dailyRate, double capacity) {
        super(model, dailyRate);
        this.capacity = capacity;
    }

    @Override
    double calculateRentalCost(int days) {
        double capacityCost = capacity * 5000;
        double total = (dailyRate + capacityCost) * days;
        return total;
    }

    @Override
    public String toString() {
        return "Truck{" + "model='" + model + ", dailyRate=" + (int)dailyRate + ", capacity=" + capacity + "톤" + '}';
    }
}
public class P3 {
    public static void main(String[] args) {
        Car car = new Car("소나타", 50000, true);
        Truck truck = new Truck("포터", 70000, 1.5);

        System.out.println(car);
        System.out.println("3일 대여료: " + (int)car.calculateRentalCost(3) + "원");

        System.out.println(truck);
        System.out.println("5일 대여료: " + (int)truck.calculateRentalCost(5) + "원");
    }
}
