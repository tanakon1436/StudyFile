public class Shape {
    private Point point;
    private String color;

    public Shape(Point p, String color) {
        this.point = p;
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point p) {
        this.point = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Double area(){
        return 0.0;
    }
    public String draw(){
        return "Template";
    }

    @Override
    public String toString() {
        return "Shape [point=" + point + ", color=" + color + ", toString()=" + super.toString() + "]";
    }
}
