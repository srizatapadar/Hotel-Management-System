package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	
	
	Reception(){
		
		b1=new JButton("NEW CUSTOMER FORM");
		b1.setBounds(10, 30, 200, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton("ROOM");
		b2.setBounds(10, 80, 200, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setOpaque(true);
		b2.addActionListener(this);
		add(b2);
		
		
		
		b3=new JButton("DEPARTMENT");
		b3.setBounds(10, 130, 200, 30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setOpaque(true);
		b3.addActionListener(this);
		add(b3);
		
		
		
		b4=new JButton("ALL EMPLOYEE INFO");
		b4.setBounds(10, 180, 200, 30);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		b4.setOpaque(true);
		b4.addActionListener(this);
		add(b4);
		
		
		
		b5=new JButton("CUSTOMER INFO");
		b5.setBounds(10, 230, 200, 30);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		b5.setOpaque(true);
		b5.addActionListener(this);
		add(b5);
		
		
		
		b6=new JButton("MANAGER INFO");
		b6.setBounds(10, 280, 200, 30);
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.WHITE);
		b6.setOpaque(true);
		b6.addActionListener(this);
		add(b6);
		
		
		
		b7=new JButton("CHECK OUT");
		b7.setBounds(10, 330, 200, 30);
		b7.setBackground(Color.BLACK);
		b7.setForeground(Color.WHITE);
		b7.setOpaque(true);
		b7.addActionListener(this);
		add(b7);
		
		
		
		
		b8=new JButton("UPDATE CHECK STATUS");
		b8.setBounds(10, 380, 200, 30);
		b8.setBackground(Color.BLACK);
		b8.setForeground(Color.WHITE);
		b8.setOpaque(true);
		b8.addActionListener(this);
		add(b8);
		
		
		
		b9=new JButton("UPDATE ROOM STATUS");
		b9.setBounds(10, 430, 200, 30);
		b9.setBackground(Color.BLACK);
		b9.setForeground(Color.WHITE);
		b9.setOpaque(true);
		b9.addActionListener(this);
		add(b9);
		
		
		
		b10=new JButton("PICK UP SERVICE");
		b10.setBounds(10, 480, 200, 30);
		b10.setBackground(Color.BLACK);
		b10.setForeground(Color.WHITE);
		b10.setOpaque(true);
		b10.addActionListener(this);
		add(b10);
		
		
		
		b11=new JButton("SEARCH ROOM");
		b11.setBounds(10, 530, 200, 30);
		b11.setBackground(Color.BLACK);
		b11.setForeground(Color.WHITE);
		b11.setOpaque(true);
		b11.addActionListener(this);
		add(b11);
		
		
		
		b12=new JButton("LOGOUT");
		b12.setBounds(10, 580, 200, 30);
		b12.setBackground(Color.BLACK);
		b12.setForeground(Color.WHITE);
		b12.setOpaque(true);
		b12.addActionListener(this);
		add(b12);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/fourth.jpg"));
		Image i2=i1.getImage().getScaledInstance(750, 600, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l5=new JLabel(i3);
		l5.setBounds(100, 70, 1000, 500);
		add(l5);
		
		
		
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setBounds(300,200,990,650);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			new AddCustomer().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b2) {
			
			new Room().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b3) {
			
		}else if(ae.getSource()==b4) {
			
			new EmployeeInfo().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b5) {
			
			new CustomerInfo().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b6) {
			
			new ManagerInfo().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b7) {
			
			new CheckOut().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b8) {
			
			new UpdateCheck().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b9) {
			
			new UpdateRoom().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b10) {
			
			new PickUp().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b11) {
			
			new SearchRoom().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b12) {
			
			new DashBoard().setVisible(true);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		
		new Reception().setVisible(true);

	}

}
