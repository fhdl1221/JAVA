package a.basic.practice3;

public class P6 {
    public static void main(String[] args) {
        int[] arr = {45, 23, 78, 12, 89, 34};
        int temp;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("두 번째로 큰 수: " + arr[1]);
    }
}
