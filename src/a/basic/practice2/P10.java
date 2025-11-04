package a.basic.practice2;

public class P10 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 0; i < n - 2; i++){
            arr[i+2] = arr[i] + arr[i+1];
        }
        System.out.printf("%d번째 피보나치 수: %d", n, arr[n-1]);
    }
}
