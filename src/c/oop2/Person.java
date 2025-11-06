package c.oop2;

public class Person {
    String name;
    int age;
    String address;

    // 생성자 이름이 같아도 매개변수를 다르게 하면 계속 생성 가능
    public Person() {
        this.name = "noname";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this(name, age);
        this.address = address;
    }
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
