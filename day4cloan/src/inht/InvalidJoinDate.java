/**
 * 
 */
package inht;

/**
 * @author rohan
 *
 */
@SuppressWarnings("serial")
public class InvalidJoinDate extends Exception {
	
	public InvalidJoinDate(String message)
	{
		super(message);
	}
	
	public InvalidJoinDate()
	{
		message="Invalid Entry of Join-Date of Employee\n";
	}
	//class filed
	String message;

}
