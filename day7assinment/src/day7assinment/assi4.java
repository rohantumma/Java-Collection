/**
 * 
 */
package day7assinment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


/**
 * @author rohan
 *
 */
public class assi4 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		Map<Integer, Employee> hMap=new HashMap<Integer, Employee>();
		
		@SuppressWarnings("unused")
		GregorianCalendar GCdate =new GregorianCalendar();
		
		Employee e1=new Employee(1,"Thor",200000.00f,"solapur",8055329631l,GCdate);
		Employee e2=new Employee(2,"loki",200000.00f,"Molapur",8055329631l,GCdate);
		Employee e3=new Employee(3,"Hela",200000.00f,"solapur",8055329631l,GCdate);
		Employee e4=new Employee(4,"Odin",200000.00f,"solapur",8055329631l,GCdate);
		Employee e5=new Employee(5,"Valkyrie",200000.00f,"solapur",8055329631l,GCdate);
		Employee e6=new Employee(6,"Doctor Strange",200000.00f,"solapur",8055329631l,GCdate);
		Employee e7=new Employee(7,"Iron Man",200000.00f,"solapur",8055329631l,GCdate);
		Employee e8=new Employee(8,"paper",200000.00f,"olapur",8055329631l,GCdate);
		Employee e9=new Employee(9,"Hammer",200000.00f,"solapur",8055329631l,GCdate);
		Employee e10=new Employee(10,"Jarvis",200000.00f,"solapur",8055329631l,GCdate);
		
		hMap.put(1,e1);
		hMap.put(2,e2);
		hMap.put(9,e3);
		hMap.put(4,e4);
		hMap.put(5,e5);
		hMap.put(6,e6);
		hMap.put(7,e7);
		hMap.put(8,e8);
		hMap.put(3,e9);
		hMap.put(10,e10);
		
		for (Map.Entry<Integer, Employee> entry : hMap.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		//idSorter
		Employee[] employeeArray= {e1,e4,e3,e8};
		 Collection<? extends Employee> list=(Collection<? extends Employee>) Arrays.asList(employeeArray);
			
			TreeSet<Employee> employeeTreeSet= new TreeSet<Employee>(new empIdSorter());
			employeeTreeSet.addAll(list);
			
			
			Iterator<Employee> iterator1 = employeeTreeSet.iterator();
			
			while(iterator1.hasNext())
			{
				System.out.println(iterator1.next());
			}
		//city sorter
			System.out.println("\n\n");
			 Collection<? extends Employee> list1=(Collection<? extends Employee>) Arrays.asList(employeeArray);
				
				TreeSet<Employee> employeeTreeSet1= new TreeSet<Employee>(new empNameSorter());
				employeeTreeSet1.addAll(list1);
				
				
				Iterator<Employee> iterator11 = employeeTreeSet1.iterator();
				
				while(iterator11.hasNext())
				{
					System.out.println(iterator11.next());
				}
        
        //search
	    System.out.println("\n\n");	
	    Object obj;
		obj=hMap.get(1);
		System.out.println(obj);
			
		
		
		addAndDisplay();
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static void addAndDisplay() throws IOException, ClassNotFoundException
	{
		@SuppressWarnings("unused")
		Map<Integer, Employee> hMap=new HashMap<Integer, Employee>();
		
		@SuppressWarnings("unused")
		GregorianCalendar GCdate =new GregorianCalendar();
		
		Employee e1=new Employee(1,"Thor",200000.00f,"solapur",8055329631l,GCdate);
		Employee e2=new Employee(2,"loki",200000.00f,"Molapur",8055329631l,GCdate);
		Employee e3=new Employee(3,"Hela",200000.00f,"solapur",8055329631l,GCdate);
		Employee e4=new Employee(4,"Odin",200000.00f,"solapur",8055329631l,GCdate);
		Employee e5=new Employee(5,"Valkyrie",200000.00f,"solapur",8055329631l,GCdate);
		Employee e6=new Employee(6,"Doctor Strange",200000.00f,"solapur",8055329631l,GCdate);
		Employee e7=new Employee(7,"Iron Man",200000.00f,"solapur",8055329631l,GCdate);
		Employee e8=new Employee(8,"paper",200000.00f,"olapur",8055329631l,GCdate);
		Employee e9=new Employee(9,"Hammer",200000.00f,"solapur",8055329631l,GCdate);
		Employee e10=new Employee(10,"Jarvis",200000.00f,"solapur",8055329631l,GCdate);
		
		hMap.put(1,e1);
		hMap.put(2,e2);
		hMap.put(9,e3);
		hMap.put(4,e4);
		hMap.put(5,e5);
		hMap.put(6,e6);
		hMap.put(7,e7);
		hMap.put(8,e8);
		hMap.put(3,e9);
		hMap.put(10,e10);
		
		
		File datafile=new File("E:\\rohan\\kjkl.txt");
		boolean append = datafile.exists();
		FileOutputStream fileOut=new FileOutputStream(datafile);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
		
		objectOutputStream.writeObject(hMap);
		
		objectOutputStream.flush();
		objectOutputStream.close();
		fileOut.close();
		
		
		
		FileInputStream fileOut1= new FileInputStream(datafile);
		//serilize object
		@SuppressWarnings("resource")
		ObjectInputStream objectOutputStream1 = new ObjectInputStream(fileOut1);
		
		Map<Integer, Employee> hMapRed=(HashMap<Integer, Employee>)objectOutputStream1.readObject();
		objectOutputStream1.close();
		fileOut1.close();
		
		System.out.println("\n\n Read file:");
		for (Map.Entry<Integer, Employee> entry : hMapRed.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		   	
	}
	

}
