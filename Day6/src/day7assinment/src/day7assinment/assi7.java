/**
 * 
 */
package day7assinment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author rohan
 *
 */
@SuppressWarnings("unused")
public class assi7 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("E:\\rohan\\TT.txt"); 
	      String[] words=null;  
	      FileReader fr = new FileReader(f1);  
	      BufferedReader br = new BufferedReader(fr); 
	      String s;     
	      String input;
	      Scanner SC=new Scanner(System.in);
	      System.out.println("Enter word that want to search:");
	      input=SC.nextLine();
			
	      int count=0;   
	      while((s=br.readLine())!=null)  
	      {
	         words=s.split(" "); 
	          for (String word : words) 
	          {
	                 if (word.equals(input))  
	                 {
	                   count++;    
	                 }
	          }
	      }
	      if(count!=0)  
	      {
	         System.out.println("The given word is present for "+count+ " Times in the file");
	      }
	      else
	      {
	         System.out.println("The given word is not present in the file");
	      }
	      
	         fr.close();


	}

}
