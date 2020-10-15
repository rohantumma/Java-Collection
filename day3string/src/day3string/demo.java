package day3string;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer st= new StringBuffer(30);

		System.out.print("capacity="+st.capacity());
		st.ensureCapacity(50);
		System.out.print(st);
		System.out.print("capacity="+st.capacity());

	}

}
