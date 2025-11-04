package a.basic.practice2;

public class P9 {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int temp;
        int x = a;
        int y = b;
        while(y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        int gcd = x;
        int result = (a*b)/gcd;
        System.out.println("최소공배수: " + result);
    }
}
