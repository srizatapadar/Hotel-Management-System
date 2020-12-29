package hotel.management.system;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener {
	
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	

	Login(){
		
		l1=new JLabel("Username");
		l1.setBounds(40, 30, 100, 40);
		add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(40, 90, 100, 40);
		add(l2);
		
		
		t1=new JTextField();
		t1.setBounds(150,30,150,30);
		add(t1);
		
		
		t2=new JPasswordField();
		t2.setBounds(150, 90, 150, 30);
		add(t2);
		
		b1=new JButton("Login");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.setBounds(40, 190, 120, 30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Cancel");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setOpaque(true);
		b2.setBounds(170, 190, 120, 30);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/second.jpg"));
		Image i2=i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3=new JLabel(i3);
		l3.setBounds(350, 20, 230, 210);
		add(l3);
		
		
		getContentPane().setBackground(Color.GRAY);
	
		setLayout(null);
		setBounds(500, 300, 600, 400);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			String username=t1.getText();
			String password=t2.getText();
			conn c=new conn();
			
			String str="select * from login where username='"+username+"' and password='"+password+"'";
			try {
			ResultSet rs=c.s.executeQuery(str);
			
			if(rs.next()) {
				
				new DashBoard().setVisible(true);
				this.setVisible(false);
				}else {
					JOptionPane.showInternalMessageDialog(null,"Invalid Username and Password");
					this.setVisible(true);
				}
			}catch(Exception e) {
				
			}
			
		}else if(ae.getSource()==b2) {
			
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		new Login();
	}
}
