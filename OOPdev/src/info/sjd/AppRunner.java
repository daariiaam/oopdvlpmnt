package info.sjd;

import java.util.logging.Logger;

import info.sjd.square.Square;

public class AppRunner {
	
	public static Logger logger=Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		Square square1=new Square();
		square1.setSide(11);
		
		logger.info("square with side "+square1.getSide()+" has area "+square1.getArea());
	}
}
