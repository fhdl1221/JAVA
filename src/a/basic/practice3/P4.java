package a.basic.practice3;

public class P4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int max = arr[0];
        for(int n : arr) {
            if(max < n) {
                max = n;
            }
        }
        int[] count = new int[max + 1];

        for(int i = 1; i < count.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == arr[j]){
                    count[i]++;
                }
            }
            System.out.println(i + ": " + count[i] + "개");
        }
    }
}
