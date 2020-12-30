package Calculators;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	String operations;
	String answer;
	double firstNum;
	double secondNum;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(6, 11, 267, 55);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn_delete = new JButton("ç");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = 
							new StringBuilder(txtDisplay.getText());
					
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
				
			}
		});
		btn_delete.setFont(new Font("Wingdings", Font.BOLD, 20));
		btn_delete.setBounds(6, 69, 60, 60);
		contentPane.add(btn_delete);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_clear.setBounds(75, 69, 60, 60);
		contentPane.add(btn_clear);
		
		JButton btn_multiply = new JButton("x");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "x";
				
			}
		});
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_multiply.setBounds(213, 69, 60, 60);
		contentPane.add(btn_multiply);
		
		JButton btn_percentage = new JButton("%");
		btn_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		btn_percentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_percentage.setBounds(144, 69, 60, 60);
		contentPane.add(btn_percentage);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_7.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_7.setBounds(6, 136, 60, 60);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_8.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_8.setBounds(75, 136, 60, 60);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_9.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_9.setBounds(144, 136, 60, 60);
		contentPane.add(btn_9);
		
		JButton btn_divide = new JButton("÷");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "÷";
				
			}
		});
		btn_divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_divide.setBounds(213, 136, 60, 60);
		contentPane.add(btn_divide);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_4.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_4.setBounds(6, 203, 60, 60);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_5.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_5.setBounds(75, 203, 60, 60);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_6.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_6.setBounds(144, 203, 60, 60);
		contentPane.add(btn_6);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_plus.setBounds(213, 203, 60, 60);
		contentPane.add(btn_plus);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_1.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_1.setBounds(6, 270, 60, 60);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_2.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_2.setBounds(75, 270, 60, 60);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_3.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_3.setBounds(144, 270, 60, 60);
		contentPane.add(btn_3);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
				
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_minus.setBounds(213, 270, 60, 60);
		contentPane.add(btn_minus);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = txtDisplay.getText() + btn_0.getText();
				txtDisplay.setText(EnterNum);
				
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_0.setBounds(6, 337, 60, 60);
		contentPane.add(btn_0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!txtDisplay.getText().contains(".")) {
					
					txtDisplay.
					setText(txtDisplay.getText() + btn_dot.getText());
				}
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_dot.setBounds(75, 337, 60, 60);
		contentPane.add(btn_dot);
		
		JButton btn_pi = new JButton("±");
		btn_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.
						parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btn_pi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_pi.setBounds(144, 337, 60, 60);
		contentPane.add(btn_pi);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNum = Double.parseDouble(txtDisplay.getText());
				
				if (operations == "+") {
					
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "-") {
					
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "x") {
					
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "%") {
					
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if (operations == "÷") {
					
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
			
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_equal.setBounds(213, 337, 60, 60);
		contentPane.add(btn_equal);
	}

}
