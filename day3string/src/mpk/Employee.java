package mpk;

import java.util.*;

public class Employee implements Comparable<Employee> {
	
	
	public int compareTo(Employee o)
	{
		if(this.getSalary()<o.getSalary()) return -1;
		else return 0;	
	}
	
	/**
	 * @param name
	 * @param empID
	 * @param salary
	 */
	public Employee(String name, int empID, float salary) {
		this.name = name;
		this.empID = empID;
		this.salary = salary;
		
	}

	/**
	 * @param name
	 * @param empID
	 * @param salary
	 * @param joinDate
	 */
	public Employee(String name, int empID, float salary, Date joinDate) {
		this.name = name;
		this.empID = empID;
		this.salary = salary;
		this.joinDate = joinDate;
		
		
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", salary=" + salary + ", joinDate=" + joinDate +"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static int getTotalEmop() {
		return totalEmop;
	}

	public static void setTotalEmop(int totalEmop) {
		Employee.totalEmop = totalEmop;
	}

	private String name;
	private  int empID;
	private float salary;
	protected static int totalEmop=0;

	private Date joinDate;

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
	

}
