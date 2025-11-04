package a.basic.practice2;

public class P11 {
    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        for(int i = 0; i < n; i++){
            res *= (i+1);
        }
        System.out.printf("%d! = %d",n,res);
    }
}
