package a.basic;

public class For {
    public static void main(String[] args) {
        int dan = 2;
        for(int i = 1; i <= 9; i++){
            System.out.println(dan + "X" + i + "=" + (dan*i));
        }

        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + "X" + j + "=" + (i*j));
            }
        }

        // enhanced for
        int[] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // for (const number of numbers) {}
        for (int number : numbers) {
            System.out.println(number);
        }

        int[] nums = {1, 2, 3};

    }
}
