/**
 * 
 */
package Collection;



import java.util.*;




/**
 * @author rohan
 *
 */
public class hashSetjava {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("Thor");
		hs.add("Hela");
		hs.add("Oden");
		
		if(hs.add("loki")==true)
		{
			System.out.println("Object added");
		}
		else System.out.println("Object Not added");
		
		Iterator<String> next= hs.iterator();
		
		while(next.hasNext())
		{
			/*if("Hela"==next.next())
			{
				System.out.println("Pela");	
			}*/
			
			System.out.println(next.next());
			
		}
		
		//String[] oops=new String[hs.size()];
		//oops=(String[] hs.toArray());
		
		//creatign array of object
		/*
		 * Object[] obj=hs.toArray();
		 
		System.out.println("Displaying elements");
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);	
		}
		*/
		
		
		//EMP hashset
		
		HashSet<Employee> employeeSet= new HashSet<Employee>(100,0.80f);
		GregorianCalendar GCdate =new GregorianCalendar();
				
		Employee e1=new Employee(1001,"loki",200000.00f,GCdate);
		Employee e2=new Employee(1002,"Thor",220000.00f,GCdate);
		Employee e3=new Employee(1003,"Oden",26000.00f,GCdate);
		Employee e4=new Employee(1004,"Aela",289000.00f,GCdate);

		employeeSet.add(e1);

		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		
		if(employeeSet.contains(e1)==true)
		{
			System.out.println("EMP exits");	
		}
		else System.out.println("EMP NOT exits");
		
		/// tree set
		/*
		Employee[] employeeArray= {e1,e2};
		
		
		List<Employee> list=Arrays.asList(employeeArray);
		
		
		TreeSet<Employee> employeeTreeSet= new TreeSet<Employee>();
		employeeTreeSet.addAll(list);
		
		Iterator<Employee> iterator1 = employeeTreeSet.iterator();
		
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		*/
		
		
		//comparator overloading
		/*
		Employee[] employeeArray= {e1,e2,e3,e4};
		
		
		List<Employee> list=Arrays.asList(employeeArray);
		
		TreeSet<Employee> employeeTreeSet= new TreeSet<Employee>(new empIdSorter());
		employeeTreeSet.addAll(list);
		
		
		Iterator<Employee> iterator1 = employeeTreeSet.iterator();
		
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		*/
		
		
		Employee[] employeeArray= {e1,e2,e3,e4};
		
		
		List<Employee> list=Arrays.asList(employeeArray);
		
		TreeSet<Employee> employeeTreeSet= new TreeSet<Employee>(new empNameSorter());
		employeeTreeSet.addAll(list);
		
		
		Iterator<Employee> iterator1 = employeeTreeSet.iterator();
		
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		
		
		
	}

	

}
