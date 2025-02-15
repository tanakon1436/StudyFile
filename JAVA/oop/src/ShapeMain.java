public class ShapeMain {
    public static void main(String[] args) {
		Point p = new Point(1.0, 2.0);
		Shape s = new Shape(p, "Red");
		System.out.println(s);

		p = new Point(3.0, 4.0);
		s.setPoint(p);
		s.setColor("Blue");
		System.out.println("X:      " + s.getPoint().getX());
		System.out.println("Y:      " + s.getPoint().getY());
		System.out.println("Color:  " + s.getColor());
		System.out.println("Area:   " + s.area());
		System.out.println("Draw:   " + s.draw());
	}

}
