package testShape;

abstract class TestShape {
	abstract void getArea();

	abstract void getPerimeter();
}

class Circle extends TestShape {
	float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	@Override
	public void getArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of the circle is" +" "+ area);

	}

	@Override
	public void getPerimeter() {

		double perimeter = 2 * 3.14 * radius;

		System.out.println("Perimeter of the circle is:"+" "+perimeter);
	}

}

class Square extends TestShape {

	float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public Square() {
		super();
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void getArea() {

		float area = side * side;

		System.out.println("Area of the square is"+" "+area);
	}

	@Override
	public void getPerimeter() {
		float Perimeter = 4 * side;

		System.out.println("Perimeter of the Square is"+" "+Perimeter);
	}

}

class Rectangle extends TestShape {
	float length;
	float breadth;

	public Rectangle() {
		super();
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void getArea() {

		float area = length * breadth;

		System.out.println("Area of the Rectangle is"+" "+area);
	}

	@Override
	public void getPerimeter() {

		float perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of the Rectange is"+" "+perimeter);
	}

}

class Shape {

	public static void main(String[] args) {

		Circle c = new Circle(3.0f);
		c.getArea();
		c.getPerimeter();

		System.out.println("................");

		Square s = new Square(4.0f);
		s.getArea();
		s.getPerimeter();

		System.out.println("................");

		Rectangle r = new Rectangle(2.7f, 4.9f);
		s.getArea();
		s.getPerimeter();

	}

}
