/**
 * 
 */
package Collection;

import java.util.Comparator;

/**
 * @author rohan
 *
 */
public class empIdSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		Employee e1=(Employee) arg0;
		Employee e2=(Employee) arg1;
		
		if(e1.getEmpId()<e2.getEmpId()) return -1;
		else if(e1.getEmpId()>e2.getEmpId()) return -1;
		else return 0;
	}
}



