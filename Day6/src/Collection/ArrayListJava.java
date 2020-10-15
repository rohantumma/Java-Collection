/**
 * 
 */
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
		ArrayList<String> listShapes=new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		//add elements is list
		for (int i =0;i<2;i++)
		{
			listShapes.add(sc.next());
		}
		listShapes.add("Rectangle");
		listShapes.add("Circle");
		listShapes.add("Tringle");
		
		
		Iterator<String> iterator = listShapes.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		//copy array list
		/*
		ArrayList<String> list1=new ArrayList<String>(listShapes);
		Iterator<String> iterator1 = list1.iterator();
		
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		*/
	}

}
