import java.io.*;
import java.util.GregorianCalendar;

import inht.Employee;



/**
 * @author rohan
 *
 */
public class ObjectPercitance {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File datafile=new File("E:\\rohan\\TT.txt");
		FileOutputStream fileOut= new FileOutputStream(datafile);
		//serilize object
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
		GregorianCalendar GCdate =new GregorianCalendar();
		Employee e1=new Employee(1001,"loki",200000.00f,GCdate);
		objectOutputStream.writeObject(e1);
		
		//de-seralze
		
		FileInputStream fileIn= new FileInputStream(datafile);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileIn);
		Employee objEmployee=(Employee) objectInputStream.readObject();
		System.out.println(objEmployee);
		
		arrayEmpOut();
		arrayEmpIn();
		
	}
	
	public static void arrayEmpOut() throws IOException
	{
		GregorianCalendar GCdate =new GregorianCalendar();
		Employee[] empArray= new Employee[4];
		empArray[0]=new Employee(1001,"loki",200000.00f,GCdate);
		empArray[1]=new Employee(1002,"Thor",200000.00f,GCdate);
		empArray[2]=new Employee(1003,"Hela",200000.00f,GCdate);
		empArray[3]=new Employee(1004,"Boot",200000.00f,GCdate);
		
		File datafile=new File("E:\\rohan\\thor.txt");
		FileOutputStream fileOut= new FileOutputStream(datafile);
		//serilize object
		@SuppressWarnings("resource")
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
		
		for (int i=0;i<empArray.length;i++)
		{
			objectOutputStream.writeObject(empArray[i]);	
		}
	}
	
	public static void arrayEmpIn() throws IOException, ClassNotFoundException
	{
		
		File datafile=new File("E:\\rohan\\thor.txt");
		FileInputStream fileOut= new FileInputStream(datafile);
		//serilize object
		@SuppressWarnings("resource")
		ObjectInputStream objectOutputStream = new ObjectInputStream(fileOut);
		Object obj;
		for (int i=0;i<4;i++)
		{
			obj=objectOutputStream.readObject();
			System.out.println(obj);
		}
		
		
		
		
		
		
	}
	
	

}
