package week4_lecture;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator implements ActionListener{
	JFrame frame;
	JTextField txt1, txt2, txt3;
	JButton btnAdd, btnClose; 
	
	public  Calculator() {
		frame=new JFrame();
		frame.setTitle("Calculator-1");
		frame.setSize(250,190);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		
		txt1 = new JTextField();
		txt1.setColumns(20);
		
		txt2 = new JTextField();
		txt2.setColumns(20);
		
		txt3 = new JTextField();
		txt3.setColumns(20);
		
		btnAdd = new JButton();
		btnAdd.setText("ADD");
		btnAdd.addActionListener(this);
		
		btnClose = new JButton();
		btnClose.setText("CLOSE");
		btnClose.addActionListener(this);
		
		frame.add(txt1);
		frame.add(txt2);
		frame.add(btnAdd);
		frame.add(txt3);
		frame.add(btnClose);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnAdd) {
			double n1, n2, n3;
			n1 = Double.parseDouble(txt1.getText());
			n2 = Double.parseDouble(txt2.getText());
			n3 = n1+n2;
			txt3.setText(Double.toString(n3));
		}
		else if(ae.getSource()==btnClose) {
			//do close
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Calculator();

	}

}
