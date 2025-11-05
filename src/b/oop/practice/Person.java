package b.oop.practice;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.print("이름: " + this.name + "나이: " + age); // name, age변수가 하나만 있다면 this생략 가능(생성자 내부에서는 this생략 불가)
    }
}
