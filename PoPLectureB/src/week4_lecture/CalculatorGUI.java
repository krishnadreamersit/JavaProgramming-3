package week4_lecture;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI implements ActionListener{
	JFrame frame;
	JTextField txtNum1, txtNum2, txtNum3;
	JButton btnAdd, btnClose;
	
	public CalculatorGUI() {
		frame = new JFrame();
		frame.setSize(250, 200);
		frame.setLayout(new FlowLayout());
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(20);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(20);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(20);
		
		btnAdd = new JButton();
		btnAdd.setText("ADD");
		btnAdd.addActionListener(this);
		
		btnClose = new JButton();
		btnClose.setText("Close");
		btnClose.addActionListener(this);
		
		frame.add(txtNum1);
		frame.add(txtNum2);
		frame.add(btnAdd);
		frame.add(txtNum3);
		frame.add(btnClose);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			System.exit(0);//Off
		}
		else if(ae.getSource()==btnAdd) {
			//get text
			double n1, n2, n3;
			n1 = Double.parseDouble(txtNum1.getText());
			n2 = Double.parseDouble(txtNum2.getText());
			//sum
			n3 = n1+n2;
			//display
			txtNum3.setText(Double.toString(n3));		
		}
	}
	public static void main(String[] args) {
		new CalculatorGUI();

	}

}
