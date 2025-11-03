package a.basic.practice;

public class P9 {
    public static void main(String[] args) {
        int math = 70, english = 80, science = 45;

        double avg = (math + english + science) / 3.0;
        boolean all = math >= 40 && english >= 40 && science >= 40;

        if(avg >= 60 && all) {
            System.out.println("합격");
        }
        if(avg >= 60 && !all) {
            System.out.println("불합격 (과목 낙제)");
        }
        if(avg < 60 && all) {
            System.out.println("불합격 (평균 미달)");
        }
    }
}
