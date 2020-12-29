package hotel.management.system;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

	public class Department extends JFrame implements ActionListener {
		
	
		JButton b1,b2;
		JTable t1; 
		
		Department()
		{
			
			
			
			t1=new JTable();
			t1.setBounds(0, 90, 600, 300);
			t1.setBackground(Color.BLACK);
			t1.setForeground(Color.WHITE);
			t1.setOpaque(true);
			add(t1);	
			
			
			b1=new JButton("Submit");
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b1.setOpaque(true);
			b1.setBounds(130, 450, 120, 30);
			b1.addActionListener(this);
			add(b1);
			
			
			b2=new JButton("Cancel");
			b2.setBackground(Color.BLACK);
			b2.setForeground(Color.WHITE);
			b2.setOpaque(true);
			b2.setBounds(350, 450, 120, 30);
			b2.addActionListener(this);
			add(b2);
			
			
			JLabel l3=new JLabel("Department");
			l3.setBounds(20, 50, 100, 30);
			l3.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l3);
			
			
			
			JLabel l4=new JLabel("Budget");
			l4.setBounds(320, 50, 200, 30);
			l4.setFont(new Font("Tahoma",Font.BOLD,15));
			add(l4);
			
			
			
			
			
			getContentPane().setBackground(Color.LIGHT_GRAY);
			
			setBounds(500,200,600,550);
			setLayout(null);
			setVisible(true);
			
		}
		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try {
				
				String str="select * from department";
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
		
		new Department().setVisible(true);
	}


}
