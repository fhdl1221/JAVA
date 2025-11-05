package a.basic.practice3;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[arr.length - i - 1];
        }
        System.out.println("원본: " + Arrays.toString(arr));
        System.out.println("뒤집기: " + Arrays.toString(newArr));

//        int temp;
//
//        for(int i = 0; i < arr.length / 2; i++) {
//            temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));
    }
}
