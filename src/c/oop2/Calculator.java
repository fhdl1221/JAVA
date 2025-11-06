package c.oop2;

class Sample {
    int value;
}
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    void printResult(int result) {
        System.out.println(result);
    }

    String printValue(int score) {
        if(score >= 50) {
            return "pass";
        } else {
            return "fail";
        }
    }

    // 배열 반환
    int[] getArray() {
        return new int[]{1, 3, 5, 7, 9};
    }

    Sample getSample() {
        return new Sample();
    }
}
