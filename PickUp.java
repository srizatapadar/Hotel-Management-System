package hotel.management.system;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

	public class PickUp extends JFrame implements ActionListener {
		
		
		
		Choice c1;
		//JCheckBox c2;
		JButton b1,b2;
		JTable t1; 
		
		PickUp()
		{
			JLabel l1=new JLabel("PickUp Service");
			l1.setBounds(300, 30, 200, 30);
			l1.setFont(new Font("Tahoma",Font.PLAIN,20));
			add(l1);
			
			
			JLabel l2=new JLabel("Type Of Car");
			l2.setBounds(50, 100, 200, 30);
			l2.setFont(new Font("Tahoma",Font.PLAIN,15));
			add(l2);
			
			
			c1=new Choice();
			try {
				
				conn c=new conn();
				ResultSet rs=c.s.executeQuery("select * from driver");
				while(rs.next()) {
					
					c1.add(rs.getString("brand"));
				}
			}catch(Exception e) {
				
			}
			c1.setBounds(300, 100, 170, 30);
			c1.setBackground(Color.GRAY);
			c1.setForeground(Color.BLACK);
			add(c1);
			
			//c2=new JCheckBox("Only Display Available");
			//c2.setBounds(400, 100, 200, 30);
			//add(c2);
			
			t1=new JTable();
			t1.setBounds(0, 200, 1000, 300);
			t1.setBackground(Color.BLACK);
			t1.setForeground(Color.WHITE);
			t1.setOpaque(true);
			add(t1);	
			
			
			b1=new JButton("Submit");
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b1.setOpaque(true);
			b1.setBounds(300, 520, 120, 30);
			b1.addActionListener(this);
			add(b1);
			
			
			b2=new JButton("Cancel");
			b2.setBackground(Color.BLACK);
			b2.setForeground(Color.WHITE);
			b2.setOpaque(true);
			b2.setBounds(500, 520, 120, 30);
			b2.addActionListener(this);
			add(b2);
			
			
			JLabel l3=new JLabel("Name");
			l3.setBounds(20, 170, 200, 30);
			l3.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l3);
			
			
			
			JLabel l4=new JLabel("Age");
			l4.setBounds(160, 170, 200, 30);
			l4.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l4);
			
			
			
			
			JLabel l5=new JLabel("Gender");
			l5.setBounds(300, 170, 200, 30);
			l5.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l5);
			
			
			
			JLabel l6=new JLabel("Company");
			l6.setBounds(440, 170, 200, 30);
			l6.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l6);
			
			
			
			JLabel l7=new JLabel("Model");
			l7.setBounds(580, 170, 200, 30);
			l7.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l7);
			
			
			JLabel l8=new JLabel("Availability");
			l8.setBounds(720, 170, 200, 30);
			l8.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l8);
			
			
			
			JLabel l9=new JLabel("Location");
			l9.setBounds(860, 170, 200, 30);
			l9.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l9);
			
			
			
			getContentPane().setBackground(Color.LIGHT_GRAY);
			
			setBounds(500,200,1000,650);
			setLayout(null);
			setVisible(true);
			
		}
		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try {
				
				String str="select * from driver where brand='"+c1.getSelectedItem()+"'";
				conn c=new conn();
				ResultSet rs=c.s.executeQuery(str);
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
			
		}else if(ae.getSource()==b2)
		{
			new Reception().setVisible(true);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		
		new PickUp().setVisible(true);
	}

}
