/**
 * 
 */
package day4exception;

/**
 * @author rohan
 *
 */
public class division {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=20;
		int y=0;
		int z=0;
		float r1,r2;
		
		int[] array ={5,7,11,13} ;
				
		try {
			//z=x/y;
			
			r1=divider(10,20);
			r2=divider(100,0);
			
			for(int i=0;i<array.length;i++)
				if(array[i] %2==0 ) System.out.println("number is didvi by 2"+array[i+1]);
				else System.out.println("Number is not divi by 2"+array[i+1]);
		}
		catch(Exception e) {
			//System.out.println("ERROE --s"+e);
			e.printStackTrace();
		}
		finally {
			System.out.println("\nFINALLY BLOCK");
		}
		System.out.println("z="+z);

	}
	
	
	public static float divider(int number,int diviser) throws ArithmeticException
	{
		
		return number/diviser;
	}

}
