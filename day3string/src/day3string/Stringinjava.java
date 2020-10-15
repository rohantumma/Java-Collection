package day3string;


public class Stringinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="good";
		String s2=s1;
		String s3="good";
		
		if(s1==s2) System.out.println("Equal");
		if(s1==s3) System.out.println("Equal");
		
		String s4= new String ("good");
		if(s1==s3) System.out.println("Equal");
		
		if(s1.equals(s3)) System.out.println("Equal");
		
		
		////////////////
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo("Pandas"));
		
		String s5="GOOD";
		System.out.println(s1.compareTo(s5));
		if(s1.equalsIgnoreCase(s5)) System.out.println("Equal");
		
		
		if(s1.isEmpty()) System.out.println("empty");
		else System.out.println("not empty");
		
		
		//////////
		System.out.println(s1.lastIndexOf(s5));
		
		
		///concattaion
		
		String k="loki is good";
		System.out.println(k.matches("(.*)good(.*)")); 
	      
		System.out.println(k.toUpperCase()); 
		
		
		
		////////////////////
		
		
		//String buffer
		StringBuffer s= new StringBuffer(30);
		String sk=s.substring(0,3);
		System.out.println(sk); 
		
		s.append(" loki");
		System.out.println(s); 
		System.out.println(s.reverse());
		//the total allocated capacity can be found by the capacity( ) method.
		
		
		System.out.print(s);
		System.out.println(s.length());
		s.insert(5, " japan ");

		System.out.println(s);
		
		
		
		
		/////////////////////
		
		//string builder
		
		StringBuilder j=new StringBuilder("Thor working");
		j.delete(1,3);
		System.out.println(j);
		
		
		
		
		
		
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
