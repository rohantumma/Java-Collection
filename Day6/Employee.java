package inht;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.Serializable;
import java.lang.*;

public class Employee implements Serializable,Cloneable  {
	
	/**
	 * @param empId
	 * @param name
	 * @param salary
	 * @param projectDate
	 */
	public Employee()
	{
		//GregorianCalendar GCdate =new GregorianCalendar();
		
	}
	public Employee(int empId, String name, float salary, GregorianCalendar projectDate) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.projectDate = projectDate;
		if (salary>30)
		{
			this.empStatus="PERMANENT";
		}
		else {
			this.empStatus="PERMANENT";
		}
	}
	
	
	public boolean equals(Object obj)
	{
		boolean eQ=false;
		if(obj!=null && obj instanceof Employee)
		{
			Employee e=(Employee)obj;
			
			if(getEmpId()==e.getEmpId() && getName()=equals(e.getName())
					eQ=true;
		}
		return eQ;
	}
	
	//Override hash coed
	public int hashCode() {
		return( (getName().length()+getSalary()/8)*getEmpId());
	}
	
	
	
	// class fileds
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" +empStatus+ empId + ", name=" + name + ", salary=" + salary + ", "
				+ "projectDate=" + projectDate.get(Calendar.DATE)+
				"/"+(projectDate.get(Calendar.MONTH)+1)+
				"/"+ projectDate.get(Calendar.YEAR)+
				 "]";
	}



	/**
	 * @return the projectDate
	 */
	public GregorianCalendar getProjectDate() {
		return projectDate;
	}



	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}



	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}



	/**
	 * @return the nextId
	 */
	public static int getNextId() {
		return nextId;
	}



	/**
	 * @param nextId the nextId to set
	 */
	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
	}



	/**
	 * @param projectDate the projectDate to set
	 */
	public void setProjectDate(GregorianCalendar projectDate) {
		this.projectDate = projectDate;
	}

	// overide clone method
	protected Object Clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		
		Employee e=(Employee)obj;
		//creating new e object using obj
		//type casting
		
		e.setEmpId(empId);
		e.setName(name);
		e.setSalary(salary);
		e.setProjectDate(projectDate);
		return e;
	}

	protected int empId;
	protected String name;
	protected float salary;
	protected transient String  empStatus;
	protected static int nextId=1; //static object shared by all 
	GregorianCalendar projectDate;

}
