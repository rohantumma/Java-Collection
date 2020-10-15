/**
 * 
 */
package ioProject;

import java.io.*;


/**
 * @author rohan
 *
 */
public class dataInput {

	private static String datafile;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readFile();

	}
	public static void readFile() throws IOException
	{
		int empId=0;
		float salary=0;
		
		File datafile=new File("E:\\rohan\\gh.dat");
		FileOutputStream la = null;
		la=new  FileOutputStream(datafile);
		DataOutputStream out = new DataOutputStream(la);
        out.writeInt(55); 
        out.writeFloat(200.00f);
        la.close();
        out.close();
        
        
        File file=new File("E:\\rohan\\gh.dat");
		
		FileInputStream fileInputStream = null;
		DataInputStream dataInputStream =null;
		try {
			fileInputStream = new FileInputStream(file);
			dataInputStream = new DataInputStream(fileInputStream);
			empId=dataInputStream.readInt();
			salary=dataInputStream.readFloat();
			
			System.out.println("empId="+empId+" Salary="+salary);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fileInputStream.close();
			dataInputStream.close();
		}
	}

}
