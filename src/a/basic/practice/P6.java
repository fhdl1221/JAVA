package a.basic.practice;

public class P6 {
    public static void main(String[] args) {
        int day = 6;

        String days = switch (day) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "잘못된 요일";
        };

        String week = switch (day) {
            case 1, 2, 3, 4, 5 -> "평일";
            case 6, 7 -> "주말";
            default -> "잘못된 요일";
        };

        System.out.printf("%d: %s은 %s입니다.", day, days, week);
    }
}
