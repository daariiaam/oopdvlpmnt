package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class AppRunner {
	
	public static Logger logger=Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		Square square1=new Square();
		square1.setSide(11);
		
		logger.info("square with side "+square1.getSide()+" has area "+square1.getArea());
		
		Triangle triangle1=new Triangle();
		triangle1.setSide(10);
		triangle1.setHeight(8);
		
		logger.info("triangle with side "+triangle1.getSide()+" and with height "+triangle1.getHeight()+" has area "+triangle1.getArea());
	
		Circle circle1=new Circle();
		circle1.setRadius(5);
		
		logger.info("circle with the radius "+circle1.getRadius()+" has area "+circle1.getArea());
		
	}
}
