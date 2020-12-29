package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener{
	
	JTable t1;
	JButton b1,b2;
	
	
	CustomerInfo(){
		
		t1=new JTable();
		t1.setBounds(0, 30, 1000, 500);
		add(t1);
		
		
		JLabel l1=new JLabel("DOCUMENT");
		l1.setFont(new Font("Tahoma",Font.BOLD,14));
		l1.setBounds(5, 10, 90, 20);
		add(l1);
		
		
		JLabel l2=new JLabel("ID NUMBER");
		l2.setFont(new Font("Tahoma",Font.BOLD,14));
		l2.setBounds(125, 10, 100, 20);
		add(l2);
		
		
		JLabel l3=new JLabel("NAME");
		l3.setFont(new Font("Tahoma",Font.BOLD,14));
		l3.setBounds(248, 10, 70, 20);
		add(l3);
		
		
		JLabel l4=new JLabel("GENDER");
		l4.setFont(new Font("Tahoma",Font.BOLD,14));
		l4.setBounds(375, 10, 90, 20);
		add(l4);
		
		
		JLabel l5=new JLabel("COUNTRY");
		l5.setFont(new Font("Tahoma",Font.BOLD,14));
		l5.setBounds(500, 10, 70, 20);
		add(l5);
		
		
		JLabel l6=new JLabel("ROOM");
		l6.setFont(new Font("Tahoma",Font.BOLD,14));
		l6.setBounds(625, 10, 70, 20);
		add(l6);
		
		
		JLabel l7=new JLabel("STATUS");
		l7.setFont(new Font("Tahoma",Font.BOLD,14));
		l7.setBounds(750, 10, 70, 20);
		add(l7);
		
		
		JLabel l8=new JLabel("DEPOSIT");
		l8.setFont(new Font("Tahoma",Font.BOLD,14));
		l8.setBounds(875, 10, 70, 20);
		add(l8);
		
		
		b1=new JButton("Load data");
		b1.setBounds(350, 535,120, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton("Back");
		b2.setBounds(500, 535,120, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setOpaque(true);
		b2.addActionListener(this);
		add(b2);
		
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setBounds(320,200,1000,600);
		setLayout(null);
		setVisible(true);
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			try {
				
				conn c=new conn();
				String str="select * from customer";
				ResultSet rs=c.s.executeQuery(str);
				
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				
			}catch(Exception e) {
				
			}
			
		}else if(ae.getSource()==b2) {
			
			new Reception().setVisible(true);
			this.setVisible(false);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		new CustomerInfo().setVisible(true);
		
	}

}

