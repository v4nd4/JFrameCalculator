
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JFrameCalculator extends JFrame{
	
	/**
	 * definition of variables
	 */
	private static final long serialVersionUID = 1L;
	double value1, value2, value3;
	char operation;
	String option;
	
	
/** 
 * main method	
 * */
	public static void main(String[] args) 
		{ 

			JFrameCalculator Program = new JFrameCalculator(); 
			Program.mainMenuCalculator(); 
			
		}
	
	public void mainMenuCalculator(){
	
		final Calculator Calc = new Calculator(); 
		JFrame frame = new JFrame("Calculator");
	
/**
 *  creation of field and buttons for Frame
 */
	

		 final JTextField field1 = new JTextField();
		 final JButton button1 = new JButton("1");
		 final JButton button2 = new JButton("2");
		 final JButton button3 = new JButton("3");
		 final JButton button4 = new JButton("4");
		 final JButton button5 = new JButton("5");
		 final JButton button6 = new JButton("6");
		 final JButton button7 = new JButton("7"); 
		 final JButton button8 = new JButton("8");
		 final JButton button9 = new JButton("9");
		 final JButton button10 = new JButton("0");
		 final JButton addButton = new JButton("+");
		 final JButton minusButton = new JButton("-");
		 final JButton multButton = new JButton("*");
		 final JButton divisionButton = new JButton("/");
		 final JButton equalButton = new JButton("=");
		 final JButton clearButton = new JButton("C");
		 final JButton dotButton = new JButton(".");
		 
 /**
  * definition of buttons bounds 
  */	 
		 
	    frame.setLayout(null);
	    field1.setEditable(false);
		field1.setBounds(10, 10, 190, 25);
		button7.setBounds(12, 40, 50, 25);
		button8.setBounds(80, 40, 50, 25);
		button9.setBounds(147, 40, 50, 25);
		button4.setBounds(12, 70, 50, 25);
		button5.setBounds(80, 70, 50, 25);
		button6.setBounds(147, 70, 50, 25);
		button1.setBounds(12, 100, 50, 25);
		button2.setBounds(80, 100, 50, 25);
		button3.setBounds(147, 100, 50, 25);
		button10.setBounds(80, 130, 50, 25);
		addButton.setBounds(205, 40, 70, 25);
		minusButton.setBounds(205, 70, 70, 25);
		multButton.setBounds(205, 100,70, 25);
		divisionButton.setBounds(205, 130, 70, 25);
		equalButton.setBounds(147 ,130, 50, 25);
		clearButton.setBounds(205 ,10, 70, 25);
		dotButton.setBounds(12 ,130, 50, 25);
		field1.setText("0");
 /**
  * definition of color in clear button 
  */
		clearButton.setForeground(Color.RED);

 /**
  * adding  components to Frame
  */
	
		frame.add(field1);
	    frame.add(button1);
	    frame.add(button2);
	    frame.add(button3);
	    frame.add(button4);
	    frame.add(button5);
	    frame.add(button6);
	    frame.add(button7);
	    frame.add(button8);
	    frame.add(button9);
	    frame.add(button10);
	    frame.add(addButton);
	    frame.add(minusButton);
	    frame.add(multButton);
	    frame.add(divisionButton);
	    frame.add(equalButton);
	    frame.add(clearButton);
	    frame.add(dotButton);
	    
	   
		frame.setVisible(true); // set window visible
		frame.setSize(300, 200);//set size
	 
	
/**
 * event on button1 
 */
		button1.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) 
			{
				
				System.out.println("You clicked button 1" + field1.getText());
				option = button1.getText();
				
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
			}	
		 
		});
	 
/**
 * event on button2 
 */	 
		button2.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) 
			{
				
				System.out.println("You clicked button 2");
				option = button2.getText(); 
				
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
			}
		 
		});
	 
/**
 * event on button3 
 */	
	 	 
		button3.addActionListener(new ActionListener()
		{

			 public void actionPerformed(ActionEvent e) 
			 {
				
				System.out.println("You clicked button 3");
				option = button3.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
				
			 }
		 
		});
	 
	 
/**
 * event on button4 
 */	
		button4.addActionListener(new ActionListener()
 	   	{
		
	 		 public void actionPerformed(ActionEvent e) 
	 		 {
				
				System.out.println("You clicked button 4");
				option = button4.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
				
		 	  }
		 
 	   	});
		 
/**
 * event on button5 
 */
 
		button5.addActionListener(new ActionListener()
	 	 {

	 		public void actionPerformed(ActionEvent e) 
	 		{
			
				System.out.println("You clicked button 5");
				option = button5.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
			
		 }
		 
	 });
	 	 
/**
 * event on button6 
 */
		button6.addActionListener(new ActionListener()
	 	 {

		    public void actionPerformed(ActionEvent e) 
		    {
			
				System.out.println("You clicked button 6");
				option = button6.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
				
		  }
		 
	 });
		 
/**
 * event on button7 
 */
	 	button7.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e) 
	 		{
			
				System.out.println("You clicked button 7");
				option = button7.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
		   }
		 
	 });
 
/**
 * event on button8 
 */ 
 
	 	button8.addActionListener(new ActionListener()
	 	{

		   public void actionPerformed(ActionEvent e) 
		   {
			
				System.out.println("You clicked button 8");
				option = button8.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
				
		   }
		 
	 });
 
/**
 * event on button9 
 */
	 	button9.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e) 
	 		{
			
				System.out.println("You clicked button 9");
				option = button9.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
			
	 		}
	 		
	 });
		 
/**
 * event on button10 
 */
	 	button10.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e) 
	 		{
			
				System.out.println("You clicked button 10");
				option = button10.getText(); 
				if (field1.getText().equals("0")){
					System.out.println("if");
					field1.setText(option);
				} else{
					System.out.println("else");
					field1.setText(field1.getText() + option );
				}
			
	 		}
		 
	 	});
	 	 
		 
/**
 * event on dot button 
 */
	 	
	 	dotButton.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e)
	 		{
			
				System.out.println("You clicked dotButton");
				option = dotButton.getText();
				
						if (field1.getText().contains(option) == false)
							{
								field1.setText( field1.getText() + option);
							}
	 		}
		 
	 	});
	 	 
 
/**
 * event on add button 
 */
	 
	 	addButton.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e) 
	 		{

				System.out.println("You clicked addbutton");
				value1 = Double.parseDouble(field1.getText()); 
				operation = 'a';
				field1.setText("0");

				

	 	}
	 });
	 
	 
/**
 * event on minus button 
 */
	 	minusButton.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e) 
	 		{
			
				System.out.println("You clicked minusButton");
				value1 = Double.parseDouble(field1.getText()); 
				operation = 'm';
				field1.setText("0");
	 		}
		 
	 	});
	 
	 
/**
 * event on multiplication button 
 */
	 	multButton.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e)
	 		{
			
				System.out.println("You clicked the multButton");
				value1 = Double.parseDouble(field1.getText()); 
				operation = 'M';
				field1.setText("0");
	 		}
		 
	 	});
	 
	 
/**
 * event on division button 
 */
	 	divisionButton.addActionListener(new ActionListener()
	 	{

	 		public void actionPerformed(ActionEvent e) 
	 		{
			
				System.out.println("You clicked divisionButton");
				value1 = Double.parseDouble(field1.getText()); 
				operation = 'D';
				field1.setText("0");
	 		}
		 
	 	});
	 
	
	 
/**
 * event on equal button
 */
	 	equalButton.addActionListener(new ActionListener()
	 	{ 

	 		public void actionPerformed(ActionEvent e) 
	 		{
			
				System.out.println("You clicked this operation: " + operation);
				value2 = Double.parseDouble(field1.getText());
				
				System.out.println("value2: " + field1.getText());
/**
 * checks operation selected and executes it 
 */
			
				switch (operation)
				{	
				case 'a':
					
					value1 = Calc.add(value1, value2);
				    break;
				    
				case 'm':
					
					value1 = Calc.minus(value1, value2);
					 break;
				
				case 'M':
					
					value1 = Calc.multiply(value1, value2);	
					 break;
					
				case 'D':
					
					value1 = Calc.division(value1, value2);	
					break;
			
			
				} 
		System.out.println("final Value: " + value1);

		    
			field1.setText(fmt(value1));
			
	 		}
		 
	 	});
		 
/**
 * event on button4 
 */
	 	clearButton.addActionListener(new ActionListener()
	 	{


	 		public void actionPerformed(ActionEvent e) 
			{
				System.out.println("You clicked the clearButton");
	
				field1.setText("0");
				value1 = 0;
				value2 = 0;
			}
		 
	 	});

	}
 	public static String fmt(double d)
 	{
 	    if(d == (long) d)
 	    {  return String.format("%d",(long)d);}
 	    else
 	        {return String.format("%s",d);
 	}

 	}
	
	
}

