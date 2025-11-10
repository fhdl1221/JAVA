package d.inheritance;

class Animal {
    String name;
    String age;

    void eat() {
        System.out.println("eat!!!!");
    }
}

class Dog extends Animal {
//    String name;
//    String age;
//
//    void eat() {
//        System.out.println("eat!!!!");
//    }

    void bark() {
        System.out.println("bark!!!!");
    }
}

class Cat extends Animal {
//    String name;
//    String age;
//
//    void eat() {
//        System.out.println("eat!!!!");
//    }

    void meow() {
        System.out.println("meow!!!!");
    }
}

public class Basic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}
