/**
 * 
 */
package day7assinment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import shape.Rectangle;
import shape.circle;
import shape.shape;
import shape.triangle;

/**
 * @author rohan
 *
 */
public class ArrayListJava {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<shape> shapeArray=new ArrayList<shape>();
		
		circle circleShape=new circle(10);
		triangle triangleShape=new triangle(20,40,50);
		Rectangle RectangleShape=new Rectangle(10,10);
		
		circleShape.calculateArea();
		circleShape.calculatePeremeter();
		
		/*
		//System.out.println(c);
		//calculateArea();
		//calculatePeremeter();
		//System.out.println(t);
		*/
		
		RectangleShape.calculateArea();
		RectangleShape.calculatePeremeter();
		
		triangleShape.calculateArea();
		triangleShape.calculatePeremeter();
		
		shape s= circleShape;
		System.out.println("Area and Perimeter of Shape "+s);

		s= RectangleShape;
		System.out.println("Area and Perimeter of Shape "+s);
		
		s=triangleShape;
		System.out.println("Area and Perimeter of Shape "+s);
		
		
		//shape[] shapeArray=new; shape[3];
		shapeArray.add(circleShape);
		shapeArray.add(RectangleShape);
		shapeArray.add(triangleShape);
		
		//shapeArray[2]=new Rectangle(2,5);
		Iterator<shape> iterator = shapeArray.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	

		
	}

}
