package a.basic.practice;

public class P4 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if(a > 0 && b > 0 && c > 0) {
            if(c < a + b) {
                System.out.println("삼각형을 만들 수 있습니다");
            } else {
                System.out.println("삼각형을 만들 수 없습니다.");
            }
        }
    }
}
