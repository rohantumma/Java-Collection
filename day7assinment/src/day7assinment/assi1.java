/**
 * 
 */
package day7assinment;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import shape.shape;

/**
 * @author rohan
 *
 */
public class assi1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//1.1
		//readText();
		//1.2
		//readAndWriteText();
		//1.3
		studentWrite();
		//5
		//addAndDisplay();

	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void readText() throws IOException
	{
		File datafile=new File("E:\\rohan\\TT.txt");
		FileInputStream fileIn=new FileInputStream(datafile);
		int i=0;    
        while((i=fileIn.read())!=-1){    
         System.out.print((char)i);    
        }    
		
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void readAndWriteText() throws IOException
	{
		File datafile=new File("E:\\rohan\\TT.txt");
		FileOutputStream fileOut=new FileOutputStream(datafile);
		String text;
		Scanner SC=new Scanner(System.in);
        System.out.println("Enter text to write into file: ");
        text= SC.nextLine();
        //convert text into Byte and write into file
        fileOut.write(text.getBytes());
        fileOut.flush();
        fileOut.close(); 
        System.out.println("Reading from file: ");
        readText();
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void studentWrite() throws IOException, ClassNotFoundException
	{
		/*
		File outputFile=new File("E:\\rohan\\TT.txt");
		FileOutputStream fs=new FileOutputStream(outputFile);
		DataOutputStream dataOutput = new DataOutputStream(fs);
	 
	    List<student> listStudent = new ArrayList<student>();
	    
        listStudent.add(new student(23, 80.5f));
        listStudent.add(new student(22, 95.0f));
        listStudent.add(new student(21, 79.8f));
 
        for (student student : listStudent) {
        	dataOutput.writeInt(student.getRollNumber());
            dataOutput.writeFloat(student.getPercentage());
        }
	    dataOutput.close();
	    fs.close();
	    */
	    System.out.println("\nread from file:");
        List<student> listStudent1 = readAll();
 
        for (student student : listStudent1) {
			System.out.print(student.getRollNumber() + "\t");
			System.out.println(student.getPercentage());
        	}   
	} 
	public static List<student> readAll() throws IOException {
		File outputFile=new File("E:\\rohan\\TT.txt");
		FileInputStream fs=new FileInputStream(outputFile);
		
		DataInputStream dataInput;
	    dataInput = new DataInputStream(new FileInputStream(outputFile));
	    
        List<student> listStudent = new ArrayList<>();
 
        try {
            while (true) {
                int roll = dataInput.readInt();
                float per = dataInput.readFloat();
 
                student student = new student(roll, per);
                listStudent.add(student);
            }
        } catch (EOFException ex) {
            // reach end of file
        }
 
        dataInput.close();
 
        return listStudent;
    }

	@SuppressWarnings("resource")
	public static void addAndDisplay() throws IOException, ClassNotFoundException
	{
		ArrayList<student> std=new ArrayList<student>();
		
		Scanner SC=new Scanner(System.in);
		
		//adstudent
		System.out.println("Enter RollNumber and Percentage");
		
		
		File datafile=new File("E:\\rohan\\StdudentArray.txt");
		boolean append = datafile.exists();
		FileOutputStream fileOut=new FileOutputStream(datafile);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
		
		std.add(new student(SC.nextInt(),SC.nextFloat()));
		//std.add(new student(SC.nextInt(),SC.nextFloat()));
		
		Iterator<student> iterator = std.iterator();
		
		while(iterator.hasNext())
		{
			objectOutputStream.writeObject(iterator.next());
			
		}
		objectOutputStream.flush();
		objectOutputStream.close();
		fileOut.close();
		
		
		
		FileInputStream fileOut1= new FileInputStream(datafile);
		//serilize object
		@SuppressWarnings("resource")
		ObjectInputStream objectOutputStream1 = new ObjectInputStream(fileOut1);
		Object obj;
		for(int i=0;i<std.size();i++)
		{
			obj=objectOutputStream1.readObject();    // read from the object stream,
			  System.out.println(obj);
		}
		
		   	
	}
}


