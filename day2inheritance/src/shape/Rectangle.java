package shape;

public class Rectangle extends shape {

	public Rectangle(int i, int j) {
		// TODO Auto-generated constructor stub
		this.length=i;
		this.width=j;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		area=length*width;
		

	}

	@Override
	public void calculatePeremeter() {
		// TODO Auto-generated method stub
		parameter=2*(length+width);
		

	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + ", parameter=" + parameter + "]";
	}



	private int length;
	private int width;

}
