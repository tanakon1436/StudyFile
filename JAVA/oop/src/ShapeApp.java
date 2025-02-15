public class ShapeApp {

	public static void main(String[] args) {
		Shape[] arrs = new Shape[3];
		arrs[0] = new Circle(new Point(1.0, 2.0), "Red", 3.0);
		arrs[1] = new Circle(new Point(3.0, 4.0), "Green", 5.0);
		arrs[2] = new Circle(new Point(6.0, 7.0), "Blue", 8.0);

		for (int i = 0; i < arrs.length; i++) {
			if (arrs[i] instanceof Circle) {
				System.out.println("Circle:");
			}
			System.out.println("-".repeat(20));

			System.out.println("X:      " + arrs[i].getPoint().getX());
			System.out.println("Y:      " + arrs[i].getPoint().getY());
			System.out.println("Color:  " + arrs[i].getColor());
			if (arrs[i] instanceof Circle) {
				System.out.println("Radius: " + ((Circle) arrs[i]).getRadius());
			}
			System.out.println("Area:   " + arrs[i].area());
			System.out.println("Draw:   " + arrs[i].draw());

			System.out.println("-".repeat(20));
			System.out.println();
		}
	}
	
}
