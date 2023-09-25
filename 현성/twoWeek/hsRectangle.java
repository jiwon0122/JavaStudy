package twoWeek;

public class hsRectangle extends hsShape{
    private double width;
    private double length;

    @Override
    public String toString() {
        return "색 = "+ this.getColor()
                +", 가로 = " +this.getWidth()
                + ", 세로 ="+this.getLength();
    }

    public hsRectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double surfaceCalc() {
        return this.getLength()*this.getWidth();
    }

    @Override
    public double lineCalc() {
        return 2*(this.getWidth()+this.getLength());
    }
}
