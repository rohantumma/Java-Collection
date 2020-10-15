package shape;

public class ShapeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		shape[] shapeArray=new shape[3];
		
		shapeArray[0]=circleShape;
		shapeArray[1]=RectangleShape;
		shapeArray[2]=triangleShape;
		
		//shapeArray[2]=new Rectangle(2,5);
		
		for(int i=0;i<shapeArray.length;i++)
		{
			System.out.println("Area and Perimeter of Shape "+shapeArray[i]);
		}
	
	}

}
