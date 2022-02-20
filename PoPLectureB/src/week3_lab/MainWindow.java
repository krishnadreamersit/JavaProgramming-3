package week3_lab;

import javax.swing.JFrame;

public class MainWindow {
	JFrame frame; //object of JFrame Class
	
	public MainWindow() {
		frame=new JFrame();
		frame.setTitle("My First Window");
		frame.setSize(500, 250);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}
}
