package twoWeek;

public class hsCircle extends hsShape{
    private double radius;

    @Override
    public String toString() {
        return "색 = "+this.getColor()
                +", 반지름 = "
                + this.getRadius();
    }

    public hsCircle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceCalc() {
        return this.getRadius()*this.getRadius()*Math.PI;
    }

    @Override
    public double lineCalc() {
        return 2*Math.PI*this.getRadius();
    }
}
