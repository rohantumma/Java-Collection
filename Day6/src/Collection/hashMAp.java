/**
 * 
 */
package Collection;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author rohan
 *
 */
public class hashMAp {

	/**
	 * @param args
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> hMap=new HashMap<Integer, Employee>();
		
		GregorianCalendar GCdate =new GregorianCalendar();
				
		Employee e1=new Employee(1001,"loki",200000.00f,GCdate);
		Employee e2=new Employee(1002,"loki",200000.00f,GCdate);
		Employee e3=new Employee(1003,"loki",200000.00f,GCdate);
		Employee e4=new Employee(1004,"loki",200000.00f,GCdate);
		Employee e5=null;
		hMap.put(1,e1);
		hMap.put(2,e2);
		hMap.put(3,e3);
		hMap.put(4,e4);
		hMap.put(5,e5);
		
		Employee obj = hMap.get(e3);
		
		
		System.out.println(obj);
		
		obj=hMap.get(1);
		System.out.println(obj);
		
		
		
		///treeMap
		
		
		/*
		TreeMap<Integer,Employee> empTree= new TreeMap<Integer,Employee>();
		empTree.putAll(hMap);
		
		int key=4;
		if((obj=empTree.get(key))!=null)
		{
			System.out.println("Found ="+obj);
		}
		
		
		Set<Integer> sref=empTree.keySet();
		
		Iterator<Integer> iter= sref.iterator();
		
		System.out.println("\nNOW DISPLAY TREE MAP DATA");
		while(iter.hasNext())
		{
			System.out.println(empTree.get(iter.next()));
		}
		*/
		
		HashMap<Employee,Float> hMap1=new HashMap<Employee,Float>();
		
		Employee e11=new Employee(1001,"Oden",20.00f,GCdate);
		Employee e21=new Employee(1002,"loki",2090.00f,GCdate);
		Employee e31=new Employee(1003,"Hela",280.00f,GCdate);
		
		hMap1.put(e11,20.00f);
		hMap1.put(e21,250.00f);
		hMap1.put(e31,280.00f);

		/*
		float obj1 = hMap1.get(e31);
		System.out.println(obj1);
		obj1=hMap1.get(e21);
		System.out.println(obj1);
		*/
		
		TreeMap<Employee,Float> empTreet1= new TreeMap<Employee,Float>(new treeMapCompataror());
		
		empTreet1.putAll(hMap1);
		//System.out.println("\n\n\n");
		//System.out.println(empTreet1);
		
		float h =empTreet1.get(e11);
	 	System.out.println(h);
		
		Set<Employee> sref=empTreet1.keySet();
		
		Iterator<Employee> iter= sref.iterator();
		
		System.out.println("\nNOW DISPLAY TREE MAP DATA");
		while(iter.hasNext())
		{
			System.out.println(empTreet1.get(iter.next()));
		}
		
				
				
		
	}

}
