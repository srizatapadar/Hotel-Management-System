package hotel.management.system;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Room extends JFrame implements ActionListener{
	
	JTable t1;
	JButton b1,b2;
	
	
	Room(){
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/eight.jpg"));
		//Image i2=i1.getImage().getScaledInstance(460, 600, Image.SCALE_DEFAULT);
		//ImageIcon i3=new ImageIcon(i2);
		JLabel l5=new JLabel(i1);
		l5.setBounds(510, 10, 480, 550);
		add(l5);
		
		t1=new JTable();
		t1.setBounds(4, 40, 500, 470);
		add(t1);
		
		JLabel l1=new JLabel("ROOM");
		l1.setFont(new Font("Tahoma",Font.BOLD,12));
		l1.setBounds(4, 10, 70, 20);
		add(l1);
		
		
		JLabel l2=new JLabel("AVAILABILITY");
		l2.setFont(new Font("Tahoma",Font.BOLD,12));
		l2.setBounds(80, 10, 90, 20);
		add(l2);
		
		
		JLabel l3=new JLabel("STATUS");
		l3.setFont(new Font("Tahoma",Font.BOLD,12));
		l3.setBounds(205, 10, 70, 20);
		add(l3);
		
		
		JLabel l4=new JLabel("PRICE");
		l4.setFont(new Font("Tahoma",Font.BOLD,14));
		l4.setBounds(295, 10, 90, 20);
		add(l4);
		
		JLabel l6=new JLabel("BED TYPE");
		l6.setFont(new Font("Tahoma",Font.BOLD,14));
		l6.setBounds(395, 10, 90, 20);
		add(l6);
		
		
		
		
		b1=new JButton("Load data");
		b1.setBounds(90, 530,120, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton("Back");
		b2.setBounds(260, 530,120, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setOpaque(true);
		b2.addActionListener(this);
		add(b2);
		
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setBounds(320,200,1000,590);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			try {
				
				conn c=new conn();
				String str="select * from room";
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
		
		new Room().setVisible(true);
		
	}

}
