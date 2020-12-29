package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DashBoard extends JFrame implements ActionListener{
	
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4;
	
	DashBoard(){
		
		mb=new JMenuBar();
		add(mb);
		
		m1=new JMenu("Hotel Management");
		m1.setForeground(Color.WHITE);
		m1.setBackground(Color.BLACK);
		m1.setOpaque(true);
		mb.add(m1);
		
		
		m2=new JMenu("Admin");
		m2.setForeground(Color.WHITE);
		m2.setBackground(Color.BLACK);
		m2.setOpaque(true);
		mb.add(m2);
		
		
		i1=new JMenuItem("Reception");
		i1.setForeground(Color.BLACK);
		i1.setBackground(Color.LIGHT_GRAY);
		i1.addActionListener(this);
		m1.add(i1);
		
		i2=new JMenuItem("Add Drivers");
		i2.setForeground(Color.BLACK);
		i2.setBackground(Color.LIGHT_GRAY);
		i2.addActionListener(this);
		m2.add(i2);
		
		
		i3=new JMenuItem("Add Rooms");
		i3.setForeground(Color.BLACK);
		i3.setBackground(Color.LIGHT_GRAY);
		i3.addActionListener(this);
		m2.add(i3);
		
		
		i4=new JMenuItem("Add Employee");
		i4.setForeground(Color.BLACK);
		i4.setBackground(Color.LIGHT_GRAY);
		i4.addActionListener(this);
		m2.add(i4);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/third.jpg"));
		Image i2=i1.getImage().getScaledInstance(1970, 1020, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(0,0,1500,870);
		add(l1);
		
		JLabel l2=new JLabel("THE TAJ GROUP WELCOMES YOU");
		l2.setBounds(480, 60, 600, 50);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Tahoma",Font.BOLD,35));
		l1.add(l2);
		
		
		mb.setBounds(0, 0, 1970, 25);	
		setLayout(null);
		setBounds(0,0,1970,1020);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getActionCommand().equals("Reception")) {
			
			new Reception().setVisible(true);
			
		}else if(ae.getActionCommand().equals("Add Employee")) {
			
			new AddEmployee().setVisible(true);
		}else if(ae.getActionCommand().equals("Add Rooms")) {
			
			new AddRooms().setVisible(true);
		}else if(ae.getActionCommand().equals("Add Drivers")) {
			
			new AddDrivers().setVisible(true);
		}
		
	}

	public static void main(String[] args) {
		
		new DashBoard().setVisible(true);

	}

}
