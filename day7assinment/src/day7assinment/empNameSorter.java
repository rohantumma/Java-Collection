/**
 * 
 */
package day7assinment;

import java.util.Comparator;

/**
 * @author rohan
 *
 */
public class empNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		int result=e1.getCity().compareTo(e2.getCity());
		if(result==0)
			return -1;
		else if(result <0)
			return -1;
		else return 0;
		
	}

}
