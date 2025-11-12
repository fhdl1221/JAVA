package e.generic;

class Parent<T> {
    private T value;

    public Parent(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Child<T> extends Parent<T> {
    public Child(T value) {
        super(value);
    }


}
public class Inheritance {
}
