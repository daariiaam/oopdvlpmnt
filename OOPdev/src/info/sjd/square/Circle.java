package info.sjd.square;

import info.sjd.AbstractShape;

public class Circle extends AbstractShape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int) (3.14*radius);
	}
	
}
