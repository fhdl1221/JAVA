package a.basic.practice2;

public class P6 {
    public static void main(String[] args) {
        int num = 17;
        boolean Prime = false;
        for(int i = 2; i < num; i++){
            if(num % i == 0) {
                System.out.printf("%d은 소수가 아닙니다.", num);
                Prime = true;
                break;
            }
        }
        if(!Prime){
            System.out.printf("%d은 소수입니다.", num);
        }
    }
}
