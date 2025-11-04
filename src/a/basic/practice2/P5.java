package a.basic.practice2;

public class P5 {
    public static void main(String[] args) {
        int num = 24;
        System.out.print("24의 약수 : ");
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
