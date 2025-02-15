class Circle extends Shape{
    private Double radius;

    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Circle(Point point, String color, double radius) {
        super(point, color);
        this.radius = radius;
    }

    public Double area(){
        return Math.PI*radius*radius;
    }
    public String draw(){
        return getColor() + " Circle";
    }
    public String toString() {
        return super.toString() + " Circle [radius=" + radius + "]";
    }

    
}

