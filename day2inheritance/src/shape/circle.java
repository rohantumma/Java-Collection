package shape;

public class circle extends shape {

	public circle(int i) {
		// TODO Auto-generated constructor stub
		this.radius=i;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		area =(float)Math.PI*radius*radius;
		

	}

	@Override
	public void calculatePeremeter() {
		// TODO Auto-generated method stub
		parameter =(float)(2*Math.PI*radius);
		
	}
	
	
   /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "circle [radius=" + radius + ", area=" + area + ", parameter=" + parameter + "]";
	}


private float radius;

}
