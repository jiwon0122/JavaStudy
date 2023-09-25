package twoWeek;

public class hsShape {
    private String color;

    public double surfaceCalc(){
        return 0.0;
    }
    public double lineCalc(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "hsShape{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public hsShape(String color) {
        this.color = color;
    }
}
