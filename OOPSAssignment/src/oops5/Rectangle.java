package oops5;

public class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Rectangle");
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.draw();
	}
}
