package e.generic;

class Box2<T> {
    private T item;
    public T getItme() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}

public class WithGeneric {
    public static void main(String[] args) {
        Box2<String> b1 = new Box2<String>();
        Box2<Integer> b2 = new Box2<Integer>();

        b1.setItem("hello");
        String str = b1.getItme();
        System.out.println(str);

        b2.setItem(123);
        int i =  b2.getItme();
        System.out.println(i);
    }
}
