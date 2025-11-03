package a.basic;

public class Variable {
    public static void main(String[] args){
        // 선언
        // 타입 변수명;
        int age;

        // 할당
        // 변수명 = 값;
        age = 20;
        System.out.printf("나이 %d", age);

        // 선언과 할당을 같이
        String name = "Kim";
        System.out.printf("이름 %s", name);

        // 기본형 타입
        // 정수형(byte, short, int , long)
        byte b = 100;
        short s = 10000;
        int i = 1000000;
        long l = 100000000L; // 마지막에 L을 꼭 붙야줘야함

        System.out.println();
        System.out.println(b);

        // 실수형
        float f = 3.14F; // long, float은 숫자뒤에 L, F를 붙여야해서 잘 안씀
        double d = 3.14;

        System.out.println(d);

        // 문자형(char)
        char c = 'A';
        System.out.println(c);

        // 참조형 타입
        // String (문자열 타입)
        String str = "Hello";
        System.out.println(str);

        String str2 = "world";
        String msg = str + str2;
        System.out.println(msg);

        // null
        String str3 = null;
        // int myInt = null; null은 참조형에만 들어가고 기본형에는 안들어감

        // 형변환
        int iA = 100;
        double dA = iA;
        System.out.println(dA);

        double dB = 3.14;
        // int iB = dB; 에러발생 자동형변환 불가
        // 자동형변환
        int iB = (int) dB;
        System.out.println(iB);
    }
}
