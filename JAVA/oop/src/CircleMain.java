public class CircleMain {

	public static void main(String[] args) {
		Circle c = new Circle(new Point(1.0, 2.0), "Red", 3.0);
		System.out.println(c);

		c.setRadius(4.0);
		System.out.println("X:      " + c.getPoint().getX());
		System.out.println("Y:      " + c.getPoint().getY());
		System.out.println("Color:  " + c.getColor());
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Area:   " + c.area());
		System.out.println("Draw:   " + c.draw());
	}
	
}
