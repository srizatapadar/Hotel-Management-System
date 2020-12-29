package hotel.management.system;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckOut extends JFrame implements ActionListener{
	
	
	Choice c1;
	JTextField t1;
	JButton b1,b2,b3;
	
	
	CheckOut(){
		
		
		JLabel l1=new JLabel("CHECK OUT");
		l1.setBounds(30, 20, 200, 30);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		add(l1);
		

		JLabel l2=new JLabel("Customer-ID");
		l2.setBounds(30, 80, 100, 30);
		l2.setFont(new Font("serif",Font.PLAIN,16));
		add(l2);
		
		
		c1=new Choice();
		try {
			
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("select * from customer");
			while(rs.next()) {
				
				c1.add(rs.getString("number"));
			}
			
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		c1.setBounds(200, 80, 150, 30);
		add(c1);

		JLabel l3=new JLabel("Room Number");
		l3.setBounds(30, 130, 100, 30);
		l3.setFont(new Font("serif",Font.PLAIN,16));
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(200, 130, 150, 30);
		add(t1);
		
		b1=new JButton("Check Out");
		b1.setBounds(50, 230, 120, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Cancel");
		b2.setBounds(230, 230, 120, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setOpaque(true);
		b2.addActionListener(this);
		add(b2);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/tick.png"));
		Image i2=i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		b3=new JButton(i3);
		b3.addActionListener(this);
		b3.setBounds(350, 83, 20, 20);
		add(b3);
		
		
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/sixth.jpg"));
		Image i5=i4.getImage().getScaledInstance(410, 255, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel l8=new JLabel(i6);
		l8.setBounds(380, 10, 410, 255);
		add(l8);
		
		
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setBounds(500,200,800,300);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			
				
				String id=c1.getSelectedItem();
				String room=t1.getText();
				String str="delete from customer where number='"+id+"'";
				String str2="update room set  available ='Available' where room='"+room+"'";
				conn c=new conn();
			
				try 
				{
					c.s.executeUpdate(str);
					c.s.executeUpdate(str2);
					JOptionPane.showMessageDialog(null, "CHECKOUT DONE");
					new Reception().setVisible(true);
					this.setVisible(true);
				
			}catch(Exception e) {
				
				System.out.println(e);
				
			}
		}else if(ae.getSource()==b2) {
			
			new Reception().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource()==b3) {
			
			conn c=new conn();
			String id=c1.getSelectedItem();
			try {
				
				ResultSet rs=c.s.executeQuery("select * from customer where number ='"+id+"'");
				while(rs.next()) {
					
					t1.setText(rs.getString("room"));
				}
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		new CheckOut().setVisible(true);

	}

}
