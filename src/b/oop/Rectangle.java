package b.oop;

public class Rectangle {
    public int width;
    public int height;

    // 생성자는 파스칼
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}
