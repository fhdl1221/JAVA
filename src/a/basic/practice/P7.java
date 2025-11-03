package a.basic.practice;

public class P7 {
    public static void main(String[] args) {
        double height = 175.0;
        double weight = 70.0;

        double bmi = weight / ((height * 0.01) * (height * 0.01));
        String result;

        if(bmi < 18.5){
            result = "저체중";
        }
        else if(bmi >= 18.5 && bmi < 23){
            result = "정상";
        }
        else if(bmi >= 23 && bmi < 25){
            result = "과체중";
        }
        else {
            result = "비만";
        }

        System.out.printf("BMI: %.2f", bmi);
        System.out.println();
        System.out.printf("%s 체중입니다.", result);
    }
}
