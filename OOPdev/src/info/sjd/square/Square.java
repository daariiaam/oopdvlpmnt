package info.sjd.square;

import info.sjd.AbstractShape;

public class Square extends AbstractShape {

	private int side;
	
	@Override
	public int getArea() {
		
		return side*side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
