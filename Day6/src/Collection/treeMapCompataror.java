package Collection;

import java.util.Comparator;

public class treeMapCompataror implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
				Employee e1=(Employee) arg0;
				Employee e2=(Employee) arg1;
				
				int result=e1.getName().compareTo(e2.getName());
				if(result==0)
					return -1;
				else if(result <0)
					return -1;
				else return 0;
				
	}

}
