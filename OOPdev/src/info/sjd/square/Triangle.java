package info.sjd.square;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {
	
	private int side;
	private int height;
	

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int) (0.5*side*height);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
