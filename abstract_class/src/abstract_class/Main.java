package abstract_class;

//Abstract class
abstract class Shape {
// Abstract method (no implementation)
	public abstract double area();
}

//Concrete class
class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

// Override abstract method
	public double area() {
		return length * width;
	}
}

//Concrete class
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

// Override abstract method
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}

//Main class
public class Main {
	public static void main(String[] args) {
		Shape shape1 = new Rectangle(5, 3);
		System.out.println("Area of rectangle: " + shape1.area());

		Shape shape2 = new Circle(2.5);
		System.out.println("Area of circle: " + shape2.area());
	}
}
