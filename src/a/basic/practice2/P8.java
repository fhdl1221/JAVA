package a.basic.practice2;

public class P8 {
    public static void main(String[] args) {
        int a = 48, b = 18;
        int temp;

        while(b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.printf("최대공약수: %d", a);
    }
}
