import java.util.Scanner;

/**
 * 
 */

/**
 * @author rohan
 *
 */

public class Consumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//task 1
	/*	Consumer c=new Consumer(1,"loki",550,5,0.0f);
		
		//c.display();
		c.calculateBillAmount();
		System.out.println(c);
	*/	
		
		consumerArrayBill();
		
		
	}
	
	public static void consumerArrayBill()
	{
		Consumer[] conArrayBill=new Consumer[4];
		
		Consumer cn_1=new Consumer(1,"Loki",500,5,0.0f);
		Consumer cn_2=new Consumer(2,"Hela",550,3,0.0f);
		Consumer cn_3=new Consumer(3,"Hulk",600,6,0.0f);
		Consumer cn_4=new Consumer(4,"Thor",300,9,0.0f);
		
		conArrayBill[0]=cn_1;
		conArrayBill[1]=cn_2;
		conArrayBill[2]=cn_3;
		conArrayBill[3]=cn_4;
		
		for (int i=0;i<conArrayBill.length;i++)
		{
			
			conArrayBill[i].calculateBillAmount();
			conArrayBill[i].display();
			
		}
		
	}
	
	public void calculateBillAmount()
	{
		consumerId=getConsumerId();
		consumerName=getConsumerName();
		units=getUnits();
		month=getmonth();
		int j;
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("Enter Units: ");
		 * int units = input.nextInt();
		 * */
		
    	
		switch((1 <= units && units <= 100 ) ? 0 :(101 <= units && units <= 200) ? 1 :(201 <= units && units <= 500)? 2:3) {
  	  case 0: 
  		billAmount=units*6;
  		  //System.out.print("6 Units "+units*6); 
  	    break;
  	  case 1: 
  		  j=((units-(units-100))*6);
  		  j=j+((units-100)*7);
  		billAmount=j;
  		 // System.out.print(" Total="+j);
  		  
  	    break;
  	  case 2:
  		  j=((units-(units-100))*6);
  		  j=j+((units-(units-100))*7);
  		  j=j+(units-200)*8;
  		billAmount=j;
  		 /*System.out.print(" 8 Units "+((units-300)*8)); 
  		  System.out.print(" Total="+j);*/
  	    break;
  	  case 3: 
  		  j=((units-(units-100))*6);
  		  j=j+((units-(units-100))*7);
  		  j=j+((units-(units-300))*8);
  		  j=j+((units-500)*9);
  		billAmount=j;
  		 /* System.out.print(" 8 Units "+((units-(units-300))*8)); 
  		  System.out.print(" 9 Units "+((units-500)*9));
  
  		  System.out.print(" Total="+j);
  		  */
  	    break;
  	}

 
	}
	
	public void display() {
		System.out.print("consumerId="+consumerId);
		System.out.print(" consumerName="+consumerName);
		System.out.print(" units="+units);
		System.out.print(" month="+month);
		System.out.print(" billAmount="+billAmount+"\n");
	}
	
	
	/**
	 * @param consumerId
	 * @param consumerName
	 * @param units
	 * @param month
	 * @param billAmount
	 * */
	
	public Consumer(int consumerId, String consumerName, int units, int month, float billAmount) {
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.units = units;
		this.month = month;
		this.billAmount = billAmount;
	}
	


	/**
	 * @return the consumerId
	 */
	public int getConsumerId() {
		return consumerId;
	}
	/**
	 * @param consumerId the consumerId to set
	 */
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	/**
	 * @return the consumerName
	 */
	public String getConsumerName() {
		return consumerName;
	}
	/**
	 */
	public void setConsumerName() {
		this.consumerName = consumerName;
	}
	/**
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}
	/**
	 * @param units the units to set
	 */
	public void setUnits(int units) {
		this.units = units;
	}
	/**
	 * @return the month
	 */
	public int getmonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setmonth(int month) {
		this.month = month;
	}
	/**
	 * @return the billAmount
	 */
	public float getBillAmount() {
		return billAmount;
	}
	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Consumer [\n consumerId=" + consumerId + ",\n consumerName=" + consumerName + ",\n units=" + units
				+ ",\n month=" + month + ",\n billAmount=" + billAmount + "]\n";
	}

	//class fields
	
	int consumerId;
	String consumerName;
	int units;
	int month;
	float billAmount;

}
