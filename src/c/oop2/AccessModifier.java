package c.oop2;

public class AccessModifier {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass(10);
        pc.resetValue();
        pc.value2 = "test msg";
        System.out.println(pc.getValue());
    }
}
