//shallow copy....clone
//reference to old copy in shallowcopy
//deep copy for every enstance new copy gets created
//deep copy is avoids shallow copy


package inht;

import java.util.*;

import javax.swing.*;



public class colaningApp {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvalidJoinDate {
		// TODO Auto-generated method stub
		GregorianCalendar GCdate =new GregorianCalendar();
		
		Employee e1=new Employee(1001,"loki",200000.00f,GCdate);
		
		System.out.println(e1);
		
		//Employee e2=e1;//shallow copy... date of e1 will change
		
		Employee e2=(Employee) e1.Clone(); //date of e1 wont change due to cloaning
		
		
		System.out.println(e2);
		GCdate = new GregorianCalendar(2019,3,4);
		
		e2.setProjectDate(GCdate);
		System.out.println(e2);
		
		System.out.println(e1);
		
		Class c=e1.getClass();
		c.getName();
		
		System.out.println(c.getName());
		System.out.println(c.getDeclaredFields());
		
		
		
		Class c1=Class.forName(c.getName());

		System.out.println(c1.getDeclaredFields());
		
		//Object obj=c1.newInstance();
		//System.out.println(obj);
		
		Scanner input = new Scanner(System.in);

		System.out.println("For Employee Thor Enter Join Date:");
		System.out.println("Enter DAY:");
		int day = input.nextInt();
		System.out.print("Enter MONTH:");
    	int month = input.nextInt();
		System.out.print("Enter YEAR:");
    	int year = input.nextInt();
    	
    	if(day>=1 && day <=31 && month>=1 && month<=31 && year>1980)
    	{
		GCdate = new GregorianCalendar(year,month-1,day);
		Employee e3=new Employee(1003,"Thor",200000.00f,GCdate);
		System.out.println(e3);
    	}
    	else {
    		throw new InvalidJoinDate("Invalid Entry of Join-Date of Employee\n");	
    	}
		
	} 
}
