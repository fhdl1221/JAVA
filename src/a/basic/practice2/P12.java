package a.basic.practice2;

public class P12 {
    public static void main(String[] args) {
        int num = 12345;
//        int[] arr = new int[5];
//        int i = 0;
//
//        while(num > 0) {
//            arr[i] = num % 10;
//            num /= 10;
//            System.out.print(arr[i]);
//            i++;
//        }

        String str = Integer.toString(num);
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
