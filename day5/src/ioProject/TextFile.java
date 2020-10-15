/**
 * 
 */
package ioProject;

import java.io.*;

/**
 * @author rohan
 *
 */
public class TextFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:\\rohan\\raju.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int value =fileInputStream.read();
		
		while(value !=-1)
		{
			System.out.print((char)value);
			value =fileInputStream.read();
		}
		
		
		File file2=new File("E:\\rohan\\New Text Document.txt");
		FileWriter writeFile=new FileWriter(file2);
		
		writeFile.write("pandas");
		writeFile.close();
		
		int[] intArray=new int[7];
	
		for (int i=0;i<intArray.length;i++)
		{
			intArray[i]=10+i;
			System.out.println(intArray[i]);
		}
		intArray[3]=19;
		intArray[5]=9;
		int i=0;
		FileOutputStream filewrite=new FileOutputStream(file2);
		
		String ja="Japan is long";
		
		
		
		filewrite.write(ja.getBytes());
		//filewrite.write(intArray.toString());
		
		
		filewrite.close();
		
		
		
		
		
		
		

	}

}
