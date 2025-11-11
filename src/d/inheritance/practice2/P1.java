package d.inheritance.practice2;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Making Sound");
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("사자 " + name + ": 어흥!");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("코끼리 " + name + ": 뿌우우!");
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("원숭이 " + name + ": 끼끼!");
    }
}

class Zoo {
    private Animal[] animals;
    int count;

    public Zoo(int capacity) {
        this.animals = new Animal[capacity];
        this.count = 0;
    }

    void addAnimal(Animal animal) {
        if(count < animals.length) {
            animals[count++] = animal;
        }
    }

    public void feedingTime() {
        System.out.println("=== 먹이 시간 ===");

        for(int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }
}

public class P1 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);
        zoo.addAnimal(new Lion("심바", 5));
        zoo.addAnimal(new Elephant("덤보", 10));
        zoo.addAnimal(new Monkey("조조", 3));

        zoo.feedingTime();
    }
}
