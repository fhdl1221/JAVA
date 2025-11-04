package a.basic.practice2;

public class P14 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(i==5)
                    break;
                System.out.println(i + "X" + j + "=" + (i*j));
            }
        }
    }
}
