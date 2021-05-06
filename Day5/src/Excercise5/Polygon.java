package Excercise5;

public class Polygon {
	
	private int side = 0;
	private String color;
	
	public Polygon(int side, String color) {
		this.side = side;
		this.color = color;
		
	}

	public void printSide() {
		System.out.println(this.side);
	}

	public void printColor() {
		System.out.println(this.color);
		}


	}


