package b.oop.practice;

public class Dog {
    String breed;
    String name;

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void sit() {
        System.out.print(this.breed + " " + this.name + "가 앉았습니다.");
    }
    public void hand() {
        System.out.print(this.breed + " " + this.name + "가 손을 내밀었습니다.");
    }
}
