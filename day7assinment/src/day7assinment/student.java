/**
 * 
 */
package day7assinment;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author rohan
 *
 */
public class student implements Serializable {
	
	
	/**
	 * @param rollNumber
	 * @param percentage
	 */
	public student() {
		
	}
	public student(int rollNumber, float percentage) {
		this.rollNumber = rollNumber;
		this.percentage = percentage;
	}
	public student(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public student(float percentage) {
		this.percentage = percentage;
	}
	
	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}
	/**
	 * @param rollNumber 
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		
		this.rollNumber = rollNumber;
	}
	/**
	 * @return the percentage
	 */
	public float getPercentage() {
		
		return percentage;
	}
	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage) {
		
		this.percentage = percentage;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [rollNumber=" + rollNumber + ", percentage=" + percentage + "]";
	}


	public int rollNumber;
	public float percentage;
	

}
