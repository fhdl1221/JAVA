package d.inheritance.practice2;

class Animal4 {
    String name;
    int age;

    public Animal4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Making Sound");
    }
}

class Lion extends Animal4 {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("사자 " + name + ": 어흥!");
    }
}

class Elephant extends Animal4 {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("코끼리 " + name + ": 뿌우우!");
    }
}

class Monkey extends Animal4 {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("원숭이 " + name + ": 끼끼!");
    }
}

class Zoo {
    private Animal4[] animals;

    public Zoo(Animal4[] animals) {
        this.animals = animals;
    }

    // 모든 동물의 소리를 출력하는 메서드
    public void feedingTime() {
        System.out.println("=== 먹이 시간 ===");

        for (Animal4 animal : animals) {
            animal.makeSound();
        }
    }
}

public class P1 {
    public static void main(String[] args) {
        Animal4 simba = new Lion("심바", 5);
        Animal4 dumbo = new Elephant("덤보", 10);
        Animal4 jojo = new Monkey("조조", 3);

        Animal4[] zooAnimals = { simba, dumbo, jojo };

        Zoo myZoo = new Zoo(zooAnimals);
        myZoo.feedingTime();
    }
}
