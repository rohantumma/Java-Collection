package day7assinment;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.Serializable;
import java.lang.*;

public class Employee implements Serializable  {
	
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

	// class fileds
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", city=" + city
				+ ", mobileNumber=" + mobileNumber + ", projectDate=" + projectDate + "]";
	}



	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}




	/**
	 * @return the mobileNumber
	 */
	public long getMobileNumber() {
		return mobileNumber;
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
	



	/**
	 * @param projectDate the projectDate to set
	 */
	public void setProjectDate(GregorianCalendar projectDate) {
		this.projectDate = projectDate;
	}

	

	protected int empId;
	protected String name;
	protected float salary;
	protected String city;
	protected long mobileNumber;
	
	/**
	 * @param empId
	 * @param name
	 * @param salary
	 * @param city
	 * @param mobileNumber
	 * @param projectDate
	 */
	public Employee(String next, int nextInt, float nextFloat, String next2, long nextLong,
			GregorianCalendar joinDate) {
		this.empId = nextInt;
		this.name = next;
		this.salary = nextFloat;
		this.city = next2;
		this.mobileNumber = nextLong;
		this.projectDate = joinDate;
	}
	
	

	

	public Employee(int i, String string, float f, String string2, long j, GregorianCalendar gCdate) {
		// TODO Auto-generated constructor stub
		this.empId = i;
		this.name = string;
		this.salary = f;
		this.city = string2;
		this.mobileNumber = j;
		this.projectDate = gCdate;
		
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	GregorianCalendar projectDate;

}
