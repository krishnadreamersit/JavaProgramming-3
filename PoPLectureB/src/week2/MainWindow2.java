package week2;

import javax.swing.JFrame; //Window

public class MainWindow2 {
	JFrame frame; //Declare
	
	public MainWindow2() {
		frame = new JFrame();//Initialize
		frame.setTitle("My Windows-2");
		frame.setSize(350, 250); //Set size (width, height)
		frame.setResizable(false);
		frame.setVisible(true); //Set visible
	}
	
	public static void main(String []args) {
		new MainWindow2();
	}
}