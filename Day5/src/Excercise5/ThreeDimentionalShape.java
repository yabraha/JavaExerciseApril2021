package Excercise5;

public class ThreeDimentionalShape extends Polygon {

	private int height = 0;
	
	public ThreeDimentionalShape(int side, String color, int height) {
		super(side, color);
		this.height = height;
	}
	public void printHeight() {
		System.out.println("the height = " + this.height);
	}

}
