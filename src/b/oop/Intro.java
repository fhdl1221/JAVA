package b.oop;

public class Intro {
    public static void main(String[] args) {
        int rec1 = calArea(10, 10);
        int rec2 = calArea(20, 20);
        int rec3 = calArea(30, 30);

        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3);
    }
    public static int calArea(int width, int height) {
        return width * height;
    }
}
