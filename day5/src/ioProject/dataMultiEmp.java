/**
 * 
 */
package ioProject;

//Java program to demonstrate DataInputStream 
//This program uses try-with-resources. It requires JDK 7 or later. 
import java.io.*; 
class dataMultiEmp 
{ 
	public static void main(String args[]) throws IOException 
	{ 
		//writing the data. 
		try ( DataOutputStream dout = 
					new DataOutputStream(new FileOutputStream("E:\\file.dat")) ) 
		{ 
			dout.writeDouble(1.1); 
			dout.writeInt(55); 
			dout.writeBoolean(true); 
			dout.writeChar('4'); 
		} 
		
		catch(FileNotFoundException ex) 
		{ 
			System.out.println("Cannot Open the Output File"); 
			return; 
		} 
		
		// reading the data back. 
		try ( DataInputStream din = 
					new DataInputStream(new FileInputStream("E:\\file.dat")) ) 
		{ 

						//illustrating readDouble() method 
			double a = din.readDouble(); 
						//illustrating readInt() method 
			int b = din.readInt(); 
						//illustrating readBoolean() method 
			boolean c = din.readBoolean(); 
						//illustrating readChar() method 
			char d=din.readChar(); 
			System.out.println("Values: " + a + " " + b + " " + c+" " + d); 
		} 
		catch(FileNotFoundException e) 
		{ 
			System.out.println("Cannot Open the Input File"); 
			return; 
		} 
	} 
} 
