package a.basic.practice2;

public class P13 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.printf("자릿수 합: %d", sum);
    }
}
