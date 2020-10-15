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
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author rohan
 *
 */
public class assi2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		readAndWriteEmployee();

	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void readAndWriteEmployee() throws IOException, ClassNotFoundException
	{
		Employee[] EmployeeArray=new Employee[1];
		Scanner SC=new Scanner(System.in);
		
		for (int i=0;i<EmployeeArray.length;i++)
		{
			System.out.println("ENTER name,ID,salary,city,mobileNo");
			EmployeeArray[0]=new Employee(SC.next(),SC.nextInt(),SC.nextFloat(),SC.next(),SC.nextLong(),JoinDate);
		}
		File datafile=new File("E:\\rohan\\Employee.txt");
		FileOutputStream fileOut=new FileOutputStream(datafile);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
		
		for (int i=0;i<EmployeeArray.length;i++)
		{
			objectOutputStream.writeObject(EmployeeArray[i]);	
		}
	
		
		FileInputStream fileOut1= new FileInputStream(datafile);
		//serilize object
		@SuppressWarnings("resource")
		ObjectInputStream objectOutputStream1 = new ObjectInputStream(fileOut1);
		Object obj;
		for (int i=0;i<EmployeeArray.length;i++)
		{
			obj=objectOutputStream1.readObject();
			System.out.println(obj);
		}
		
	}
	static GregorianCalendar JoinDate=new GregorianCalendar ();

}
