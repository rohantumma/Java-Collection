//inner class
//!st create exermnal class
//then create inner class


package innercalss;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame {
	
	//constaruscetr
	/**
	 * @param button
	 */
	public Myframe(JButton button) throws HeadlessException{
		super("Myframe");
		this.button = button;
		
		//add button to container
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(button);
		
		// register event listener
		//MyListener listner =new MyListener();
		//MyInnerListener myListner= new MyInnerListener();
		//button.addActionListener(myListner);
		
		//anomnus inner class
		/*instantiate annonymus inner class and pass that instance
		 reference to addActionListener () for register listner*/
		
		button.addActionListener(new  ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object obj = e.getSource();
				if(obj.equals(button))
				{
					button.setText("Clicked button");
				}
			}
			
		});
		
		
		setSize(400,200);
		setVisible(true);	
	}
	/**
	 * @return the button
	 */
	public JButton getButton() {
		return button;
	}

	/**
	 * @param button the button to set
	 */
	public void setButton(JButton button) {
		this.button = button;
	}



	//inner class
	class MyInnerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object obj = e.getSource();
			if(obj.equals(button))
			{
				button.setText("Clicked button");
			}

		}
		
	}
	
	//class fileds

	JButton button;
	

	// reflection
	
	/*RTTI Run time type identification ..
	 * reflection in java
	 * used when application development
	 * used in eclips
	 * assecepts->1 instanceof()...requried in advance programming
	 * 			  2 getclass()...retuen instance of class
	 * 			  3.newInstance 
	 * 			  4.forname ...static method in 'class' class
	 * 
	 * */
	
	
}
