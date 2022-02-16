package week3_lab2;

import javax.swing.JFrame; //Window
import javax.swing.ImageIcon; //Icon
import javax.swing.JButton; //Button

import java.awt.FlowLayout; //Layout
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindow2 implements ActionListener {
	
	JFrame frame; //declare an object of JFrame
	JButton btnClose; //object of Button
	
	public MainWindow2() {
		frame = new JFrame();
		frame.setTitle("Calculator");		
		//Set icon
		ImageIcon icon= new ImageIcon("icon.png");
		frame.setIconImage(icon.getImage());		
		frame.setSize(500, 350); //width, height
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setLayout(new FlowLayout());
		
		btnClose = new JButton();
		btnClose.setText("Close");		
		btnClose.addActionListener(this);
		
		frame.add(btnClose);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==btnClose) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new MainWindow2();//object initialization
	}
}