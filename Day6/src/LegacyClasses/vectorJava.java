/**
 * 
 */
package LegacyClasses;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

/**
 * @author rohan
 *
 */
public class vectorJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vectorJava();
		propertiesJava();
		
	}
	public static void vectorJava()
	{
		Vector<Integer> ve = new Vector<Integer>();
	       ve.add(10);
	       ve.add(20);
	       ve.add(30);
	       ve.add(40);
	       ve.add(50);
	       ve.add(60);

	       Iterator<Integer> it=ve.iterator();
	       while(it.hasNext())
	       {
	    	   System.out.println(it.next());
	       }
	}
	public static void propertiesJava()
	{
		Properties pr = new Properties();
	    pr=System.getProperties();
	    System.out.println(pr);
	    Enumeration em=pr.keys();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
	}
	
	
	
}
