package twoWeek;

public class hsDriver {
    public static void main(String[] args) {
        hsCircle redcircle = new hsCircle("빨강", 2.5);
        System.out.println("원: "+redcircle.toString());
        System.out.println("면적 : "+redcircle.surfaceCalc());
        System.out.println("둘레 : "+redcircle.lineCalc());

        hsRectangle blueRect = new hsRectangle("파랑", 3.0, 4.0);
        System.out.println("직사각형: "+blueRect.toString());
        System.out.println("면적 : "+blueRect.surfaceCalc());
        System.out.println("둘레 : "+blueRect.lineCalc());

        hsCircle greenCir = new hsCircle("초록", 3.0);
        System.out.println("원: "+greenCir.toString());
        System.out.println("면적 : "+greenCir.surfaceCalc());
        System.out.println("둘레 : "+greenCir.lineCalc());
    }
}
