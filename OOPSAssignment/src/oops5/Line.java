package oops5;
public class Line extends Shape{

	@Override
	void draw() {
		System.out.println("Line");
		
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		line.draw();
	}
	
}
