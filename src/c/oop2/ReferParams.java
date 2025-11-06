package c.oop2;

class Data {
    int value;
}

public class ReferParams {
    void changeValue(Data d) {
        d.value = 99;
        System.out.println(d.value);
    }
    public static void main(String[] args) {
        ReferParams ref = new ReferParams();
        Data d = new Data();
        d.value = 10;
        ref.changeValue(d);
        System.out.println(d.value);
    }
}
