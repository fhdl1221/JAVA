package a.basic.practice;

public class P10 {
    public static void main(String[] args) {
        int price = 120000;
        boolean isMember = true;
        double result = 0;
        int discount = 0;

        if(price >= 100000) {
            result = price * 0.9;
            discount = 10;
        }
        else if(price >= 50000) {
            result = price * 0.5;
            discount = 5;
        }

        if(isMember) {
            result = result * 0.95;
            discount += 5;
        }

        System.out.printf("원가: %d", price);
        System.out.println();
        System.out.printf("할인율: %d%%", discount);
        System.out.println();
        System.out.printf("최종 금액: %d원", (int)result);
    }
}
