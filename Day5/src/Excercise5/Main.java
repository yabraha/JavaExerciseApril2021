package Excercise5;

public class Main {
	public static void main(String[] args) {
		 
		Polygon rectangle = new Polygon(4, "red");
		rectangle.printSide();
		rectangle.printColor();
		
		Polygon triangle = new Polygon(3, "yellow");
		triangle.printSide();
		triangle.printColor();
		
		Polygon hexgon = new Polygon(6, "black");
		hexgon.printSide();
		hexgon.printColor();;
	
		ThreeDimentionalShape hexgon3D = new ThreeDimentionalShape(7,"green", 15);
		hexgon3D.printSide();
		hexgon3D.printColor();
		hexgon3D.printHeight();
	}
	

}
