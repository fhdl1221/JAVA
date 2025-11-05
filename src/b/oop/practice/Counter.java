package b.oop.practice;

public class Counter {
    int count;

    public Counter() {
        this.count = 0; // 생성자 만들지 않아도 int의 초기값은 0이기 때문에 괜찮음
    }

    public int increment() {
        return this.count++;
    }

    public int decrement() {
        return this.count--;
    }

    public void getCount() {
        System.out.print("count: " + this.count);
    }

    public void reset() {
        this.count = 0;
    }
}
