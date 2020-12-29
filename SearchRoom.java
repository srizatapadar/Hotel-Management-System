package hotel.management.system;

import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class SearchRoom extends JFrame implements ActionListener {
	
	
	
		JComboBox c1;
		JCheckBox c2;
		JButton b1,b2;
		JTable t1; 
		
		SearchRoom()
		{
			JLabel l1=new JLabel("Search For Room");
			l1.setBounds(300, 30, 200, 30);
			l1.setFont(new Font("Tahoma",Font.PLAIN,20));
			add(l1);
			
			
			JLabel l2=new JLabel("Room Bed Type");
			l2.setBounds(50, 100, 200, 30);
			l2.setFont(new Font("Tahoma",Font.PLAIN,15));
			add(l2);
			
			
			c1=new JComboBox(new String[] {"Single Bed" , "Double Bed"});
			c1.setBounds(200, 100, 150, 30);
			c1.setBackground(Color.GRAY);
			c1.setForeground(Color.BLACK);
			add(c1);
			
			
			c2=new JCheckBox("Only Display Available");
			c2.setBounds(400, 100, 200, 30);
			add(c2);
			
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
			
			
			JLabel l3=new JLabel("Room Number");
			l3.setBounds(20, 170, 200, 30);
			l3.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l3);
			
			
			
			JLabel l4=new JLabel("Availability");
			l4.setBounds(220, 170, 200, 30);
			l4.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l4);
			
			
			
			
			JLabel l5=new JLabel("Cleaning Status");
			l5.setBounds(420, 170, 200, 30);
			l5.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l5);
			
			
			
			JLabel l6=new JLabel("Price");
			l6.setBounds(620, 170, 200, 30);
			l6.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l6);
			
			
			
			JLabel l7=new JLabel("Bed Type");
			l7.setBounds(820, 170, 200, 30);
			l7.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l7);
			
			
			
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
				
				String str="select * from Room where bed_type='"+c1.getSelectedItem()+"'";
				String str2="select * from Room where available='Available' AND bed_type='"+c1.getSelectedItem()+"'" ;
				conn c=new conn();
				ResultSet rs=c.s.executeQuery(str);
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				
				if (c2.isSelected())
				{
					ResultSet rs2 = c.s.executeQuery(str2);
					t1.setModel(DbUtils.resultSetToTableModel(rs2));
				}else {
					
					rs=c.s.executeQuery(str);
					t1.setModel(DbUtils.resultSetToTableModel(rs));
				}
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
		
		new SearchRoom().setVisible(true);

	}

}
