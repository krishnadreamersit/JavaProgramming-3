package week3_lab;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow implements ActionListener {
	JFrame frame;
	JButton btnClose;
	
	public MainWindow() {
		frame=new JFrame();
		frame.setTitle("Calculator");
		frame.setSize(500, 350);
		frame.setResizable(false);
		ImageIcon icon=new ImageIcon("icon.png");
		frame.setIconImage(icon.getImage());
		frame.setLayout(new FlowLayout());
		
		btnClose=new JButton();
		btnClose.setText("Close");
		btnClose.addActionListener(this);
		
		frame.add(btnClose);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			System.exit(0);
		}
	}
	
	public static void main(String []args) {
		new MainWindow();
	}
}