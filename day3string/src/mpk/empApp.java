package mpk;

import java.util.*;

public class empApp {


	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Employee em= new Employee("pandas",1,000,new Date(2019,2,12));
		Employee em2= new Employee("pandas",1,900,new Date(2019,4,12));
		Employee em3= new Employee("pandas",1,5000,new Date(2019,9,12));
		
		int value=em.compareTo(em2);
		System.out.println(value);

		System.out.println(em);

		System.out.println(em2);
		
		Employee[] emarray=new Employee[4];
		emarray[0]=em;
		emarray[1]=em2;
		emarray[2]=em3;
		emarray[3]=em;
		

		System.out.println(" ");
		for (int i=0;i<emarray.length;i++)
		{
			System.out.println(emarray[i]);
		}
		
		Arrays.sort(emarray);
		System.out.println(" ");
		for (int i=0;i<emarray.length;i++)
		{
			System.out.println(emarray[i]);
		}		
	}

	

}
