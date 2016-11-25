import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameCalculator extends javax.swing.JFrame {
    
    private static final long serialVersionUID = 1L;
	double value1, value2, value3;
	String operation;
	String option;
public JFrameCalculator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            JFrameCalculator Program = new JFrameCalculator(); 
			Program.mainMenuCalculator(); 
    }
public void mainMenuCalculator(){
		final Calculator Calc = new Calculator(); 
		JFrame frame = new JFrame("Calculator");
 //creation of field and buttons for Frame
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
                 final JButton pi = new JButton("π");
                 final JButton sin = new JButton("sin");
                 final JButton cos = new JButton("cos");
                 final JButton tan = new JButton("tan");
                 final JButton sqrt = new JButton("√");
                 final JButton log = new JButton("log");
                 final JButton sqr = new JButton("<html>x<sup>2</sup></html>");
                 final JButton cube = new JButton("<html>x<sup>3</sup></html>");
                 final JButton exp = new JButton("<html>x<sup>y</sup></html>");
                 final JButton negexp = new JButton("<html>x<sup>-1</sup></html>");
		 final JButton addButton = new JButton("+");
		 final JButton minusButton = new JButton("-");
		 final JButton multButton = new JButton("*");
		 final JButton divisionButton = new JButton("/");
		 final JButton equalButton = new JButton("=");
		 final JButton clearButton = new JButton("C");
		 final JButton dotButton = new JButton(".");
  //definition of buttons bounds 
                frame.setLayout(null);
                field1.setEditable(false);
		field1.setBounds(10, 10, 190, 25);
		button7.setBounds(12, 40, 50, 25);
		button8.setBounds(80, 40, 50, 25);
		button9.setBounds(148, 40, 50, 25);
		button4.setBounds(12, 70, 50, 25);
		button5.setBounds(80, 70, 50, 25);
		button6.setBounds(148, 70, 50, 25);
		button1.setBounds(12, 100, 50, 25);
		button2.setBounds(80, 100, 50, 25);
		button3.setBounds(148, 100, 50, 25);
		button10.setBounds(80, 130, 50, 25);
                pi.setBounds(304, 40, 70, 25);
                sin.setBounds(304, 70, 70, 25);
                cos.setBounds(304, 100, 70, 25);
                tan.setBounds(304, 130, 70, 25);
                sqr.setBounds(392, 40, 70, 25);
                cube.setBounds(392, 10, 70, 25);
                log.setBounds(392, 70, 70, 25);
                exp.setBounds(392, 100, 70, 25);
                sqrt.setBounds(392, 130, 70, 25);
                negexp.setBounds(304, 10, 70, 25);
		addButton.setBounds(216, 40, 70, 25);
		minusButton.setBounds(216, 70, 70, 25);
		multButton.setBounds(216, 100,70, 25);
		divisionButton.setBounds(216, 130, 70, 25);
		equalButton.setBounds(148, 130, 50, 25);
		clearButton.setBounds(216 ,10, 70, 25);
		dotButton.setBounds(12 ,130, 50, 25);
		field1.setText("0");
                clearButton.setForeground(Color.RED);//definition of color in clear button 
    //adding  components to Frame
            frame.add(pi);
            frame.add(sin);
            frame.add(cos);
            frame.add(tan);
            frame.add(sqr);
            frame.add(cube);
            frame.add(sqrt);
            frame.add(log);
            frame.add(exp);
            frame.add(negexp);
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
		frame.setSize(500, 230);//set size
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{		
				option = button1.getText();
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}
			}	
		});
                
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				option = button2.getText(); 	
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}
			}
		});
	 
		button3.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e) 
			 {
				option = button3.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}			
			 }
		});
	 
		button4.addActionListener(new ActionListener()
                {		
	 		 public void actionPerformed(ActionEvent e) 
	 		 {
				option = button4.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}			
		 	  }
 	   	});
		 
		button5.addActionListener(new ActionListener()
	 	 {
	 		public void actionPerformed(ActionEvent e) 
	 		{
				option = button5.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}	
                        }		 
                });
	 	
		button6.addActionListener(new ActionListener()
	 	 {
		    public void actionPerformed(ActionEvent e) 
		    {
				option = button6.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}				
		  }		 
                });
		
                button7.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{
				option = button7.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}
		   }		 
                });
                
                button8.addActionListener(new ActionListener()
	 	{
		   public void actionPerformed(ActionEvent e) 
		   {
				option = button8.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}				
		   }
		 
                });
 
                button9.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{
				option = button9.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}			
	 		}	 		
                });
		 
	 	button10.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{
				option = button10.getText(); 
				if (field1.getText().equals("0")){
					field1.setText(option);
				} else{
					field1.setText(field1.getText() + option );
				}			
	 		}		 
	 	});
	 	
	 	pi.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
				pi.setForeground(Color.red);
                                option = Double.toString(Math.PI);
				if (field1.getText().equals("0")){
					field1.setText(option);
							}
	 		}		 
	 	});
                
                sin.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
                                sin.setForeground(Color.red);
				operation = "sin";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
	 		}		 
	 	});
                
                cos.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
                                cos.setForeground(Color.red);
				operation = "cos";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
	 		}		 
	 	});
                tan.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
                                tan.setForeground(Color.red);
				operation = "tan";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
	 		}		 
	 	});
                
                sqrt.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
                                sqrt.setForeground(Color.red);
				operation = "sqrt";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
	 		}		 
	 	});

                sqr.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
                                sqr.setForeground(Color.red);
				operation = "sqr";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
	 		}		 
	 	});
                
                cube.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
                                cube.setForeground(Color.red);
				operation = "cube";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
	 		}		 
	 	});
                log.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{
                                log.setForeground(Color.red);
				operation = "log";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
	 		}		 
	 	});
                
                exp.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{
                                exp.setForeground(Color.red);
				value1 = Double.parseDouble(field1.getText()); 
				operation = "exp";
				field1.setText("0");
                        }
                });
                
                negexp.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{
                                negexp.setForeground(Color.red);
				operation = "negexp";
				if (field1.getText().equals("0")){
					field1.setText(option);
				
                                }
                        }
                });
                
	 	dotButton.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{			
				option = dotButton.getText();				
                                    if (field1.getText().contains(option) == false)
                                        {
                                        field1.setText( field1.getText() + option);
                                        }
	 		}
	 	});
	 	 
	 	addButton.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{
				value1 = Double.parseDouble(field1.getText()); 
				operation = "add";
				field1.setText("0");
                        }
                });
	 
                minusButton.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{			
				value1 = Double.parseDouble(field1.getText()); 
				operation = "minus";
				field1.setText("0");
	 		}
		 
	 	});
	 
	 	multButton.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e)
	 		{	
				value1 = Double.parseDouble(field1.getText()); 
				operation = "multiply";
				field1.setText("0");
	 		}
	 	});
	 
	 	divisionButton.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
	 		{	
				value1 = Double.parseDouble(field1.getText()); 
				operation = "divide";
				field1.setText("0");
	 		}
		 
	 	});
                
	 	equalButton.addActionListener(new ActionListener()
	 	{ 
	 		public void actionPerformed(ActionEvent e) 
	 		{	
				value2 = Double.parseDouble(field1.getText());
				switch (operation)
				{	
				case "add":
					value3 = Calc.add(value1, value2);
                                break;    
				case "minus":
					value3 = Calc.minus(value1, value2);
                                break;
				case "multiply":
					value3 = Calc.multiply(value1, value2);	
                                break;	
				case "divide":
					value3 = Calc.division(value1, value2);	
                                break;
                                case "sin":
                                        double radians = Math.toRadians(value2);
					value3 = Math.sin(radians);
                                break;
                                case "cos":
                                        double radians1 = Math.toRadians(value2);
					value3 = Math.cos(radians1);
                                break;    
                                case "tan":
                                        double radians2 = Math.toRadians(value2);
					value3 = Math.cos(radians2);
                                break;
                                case "sqrt":
                                        double root = Math.sqrt(value2);
					value3 = root;
                                break;
                                case "sqr":
                                        double sqr = Math.pow(value2, 2);
					value3 = sqr;
                                break;
                                case "log":
                                        double log = Math.log(value2);
					value3 = log;
                                break;
                                case "cube":
                                        double cube = Math.pow(value2, 3);
					value3 = cube;
                                break;
                                case "exp":
					double exp = Math.pow(value1, value2);
                                        value3 = exp;
                                break;
                                case "negexp":
                                        double negexp = Math.pow(value2, -1);
					value3 = negexp;
                                break;
                                }
                                
                    field1.setText(Double.toString(value3));
                    sin.setForeground(Color.black);
                    cos.setForeground(Color.black);
                    tan.setForeground(Color.black);
                    sqrt.setForeground(Color.black);
                    sqr.setForeground(Color.black);
                    log.setForeground(Color.black);
                    negexp.setForeground(Color.black);
	 		}
	 	});
		 
                clearButton.addActionListener(new ActionListener()
	 	{
	 		public void actionPerformed(ActionEvent e) 
			{
				field1.setText("0");
				value1 = 0;
				value2 = 0;
                                sin.setForeground(Color.black);
                                cos.setForeground(Color.black);
                                tan.setForeground(Color.black);
                                sqrt.setForeground(Color.black);
                                sqr.setForeground(Color.black);
                                log.setForeground(Color.black);
                                negexp.setForeground(Color.black);
			}
	 	});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
