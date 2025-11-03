package a.basic;

public class Operator {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a%b);

        int x = 10;
        int y = 3;
        System.out.println(x/y);

        double result = (double)x/y;
        System.out.println(result);

        System.out.println("x = " + ++x);
        System.out.println("x = " + x);

        x += 5;
        System.out.println("x += 5 => " + x);

        int bigNum = 999;
        int smallNum = 1;

        System.out.println(bigNum > smallNum);

        String strA = "hello";
        String strB = "hello";
        String strC = new String("hello");

        System.out.println(strA == strB);
        System.out.println(strA == strC);

        System.out.println(strA.equals(strC));

        int myX = 0;
        if (myX!=0 && 10/x>1) {
            System.out.println("실행되나요?");
        }
    }
}
