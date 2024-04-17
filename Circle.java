package classtest;

public class Circle {
	private double radius;
	private double area;
	public double getRadius() {
		return radius;
	}

	final double PI = 3.14;
	
	double getArea() {
		return area;
	}
	void calArea() {
		area = PI * radius * radius;
	}
	
	void show() {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
	}
}

