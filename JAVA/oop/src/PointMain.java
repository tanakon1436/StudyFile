public class PointMain {
    public static void main(String[] args) {
		Point p = new Point(1.0, 2.0);
		System.out.println(p);
		
		p.setX(3.0);
		p.setY(4.0);
		System.out.println("X: " + p.getX());
		System.out.println("Y: " + p.getY());
	}

}
