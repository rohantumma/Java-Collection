package day3array;

import java.util.*;
public class Javaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray=new int[7];
		
		for (int i=0;i<intArray.length;i++)
		{
			intArray[i]=10+i;
			System.out.println(intArray[i]);
		}
		intArray[3]=19;
		intArray[5]=9;
		
		Arrays.sort(intArray);
		demo();
		System.out.println();
		//displayarray(intArray);
		//twodarray();
		
	}
	
	public static void demo() {
		System.out.println("print demo");
		
	}
	
	public static void displayarray(int [] intArray) {
		/*for (int i=0;i<intArray.length;i++)
		{
			//intArray[i]=10+i;
			System.out.println(intArray[i]);
		}*/
		for(int n:intArray) {
			System.out.println(n);
		}
	}
	
	
	public static void twodarray() {
		
		int[][] twoArray=new int[4][4];
		for (int i=0;i<twoArray.length;i++)
		{
			for (int j=0;j<twoArray.length;j++)
			{
				twoArray[i][j]=100+i;
				System.out.print(twoArray[i][j]+" ");
			}
			System.out.println();
			
		}	
	}
	
}
