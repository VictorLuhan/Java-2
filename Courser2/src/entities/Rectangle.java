package entities;

public class Rectangle {

	public double width;
	public double right;
	
	public double area() {
		return width * right;
	}
	public double parameter() {
		return 2 * (width + right);
	}
	public double diagonal() {
		return Math.sqrt(width * width + right * right);
	}

}
