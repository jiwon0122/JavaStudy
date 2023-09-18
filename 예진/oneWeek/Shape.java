package study6;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0; // 도형의 면적은 0.0으로 초기화
    }

    public double calculatePerimeter() {
        return 0.0; // 도형의 둘레는 0.0으로 초기화
    }

    @Override
    public String toString() {
        return "색 = " + color;
    }
}
