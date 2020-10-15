package shape;

public class triangle extends shape {

	public triangle(int i, int j) {
		// TODO Auto-generated constructor stub
		this.base=i;
		this.height=j;
	}
	
	public triangle(int i, int j,int k) {
		// TODO Auto-generated constructor stub
		this.base=i;
		//this.height=j;
		this.side=k;
	}
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		area=(float) (0.5*base*height);
		

	}
	@Override
	public void  calculatePeremeter() {
		// TODO Auto-generated method stub
		parameter = base+side+side;

	}
	
	
	private float base;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "triangle [base=" + base + ", height=" + height + ", side=" + side + ", area=" + area + ", parameter="
				+ parameter + "]";
	}


	private float height;
	private float side;
	

}
