package week4_lecture_2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow implements ActionListener {

	JFrame frame;
	JLabel lblUser, lblPassword;
	JTextField txtUser, txtPassword;
	JButton btnLogin;
	
	public LoginWindow() {
		frame = new JFrame();
		frame.setTitle("Login window");
		frame.setSize(250, 150);
		frame.setResizable(false);
		
		lblUser = new JLabel();
		lblUser.setText("User : ");
		
		txtUser = new JTextField();
		txtUser.setColumns(20);
		
		lblPassword = new JLabel();
		lblPassword.setText("Password : ");
		
		txtPassword = new JTextField();
		txtPassword.setColumns(20);
	
		btnLogin = new JButton();
		btnLogin.setText("Login");
		btnLogin.addActionListener(this);
		
		frame.setLayout(new GridLayout(3,2));
		frame.add(lblUser);
		frame.add(txtUser);
		frame.add(lblPassword);
		frame.add(txtPassword);
		frame.add(new JLabel());//blank
		frame.add(btnLogin);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnLogin) {
			String un, pw;
			un=txtUser.getText();
			pw=txtPassword.getText();
			User u1=new User(un, pw);
			u1.doLogin();
		}
	}
	public static void main(String[] args) {
		new LoginWindow();

	}

}
