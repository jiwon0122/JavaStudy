package study6;

public class Driver3 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        // 빨간색 원 생성
        Circle redCircle = new Circle("빨강", 2.5);
        System.out.println(redCircle);
        System.out.println("면적: " + redCircle.calculateArea());
        System.out.println("둘레: " + redCircle.calculatePerimeter() + "\n");
        shapes[0] = redCircle;

        // 파란색 직사각형 생성
        Rectangle blueRectangle = new Rectangle("파랑", 3.0, 4.0);
        System.out.println(blueRectangle);
        System.out.println("면적: " + blueRectangle.calculateArea());
        System.out.println("둘레: " + blueRectangle.calculatePerimeter() + "\n");
        shapes[1] = blueRectangle;

        // 초록색 원 생성
        Circle greenCircle = new Circle("초록", 3.0);
        System.out.println(greenCircle);
        System.out.println("면적: " + greenCircle.calculateArea());
        System.out.println("둘레: " + greenCircle.calculatePerimeter() + "\n");
        shapes[2] = greenCircle;

    }
}

