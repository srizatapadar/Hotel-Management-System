package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDrivers extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3,t4,t5;
	JComboBox c1,c2;
	JButton b1,b2;
	
	AddDrivers(){
		
		JLabel l1=new JLabel("ADD DRIVERS");
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		l1.setBounds(145, 20, 150, 20);
		add(l1);
		
		JLabel name=new JLabel("Name");
		name.setBounds(60, 70, 100, 30);
		name.setFont(new Font("serif",Font.PLAIN,16));
		add(name);
		
		
		t1=new JTextField();
		t1.setBounds(200, 70, 150, 30);
		add(t1);
		
		
		JLabel age=new JLabel("Age");
		age.setBounds(60, 120, 100, 30);
		age.setFont(new Font("serif",Font.PLAIN,16));
		add(age);
		
		t2=new JTextField();
		t2.setBounds(200, 120, 150, 30);
		add(t2);
		
		
		JLabel gender=new JLabel("Gender");
		gender.setBounds(60, 170, 100, 30);
		gender.setFont(new Font("serif",Font.PLAIN,16));
		add(gender);
		
		
		c1=new JComboBox(new String[] {"Male" , "Female"});
		c1.setBounds(200, 170, 150, 30);
		add(c1);
		
		
		JLabel car=new JLabel("Car Company");
		car.setBounds(60, 220, 100, 30);
		car.setFont(new Font("serif",Font.PLAIN,16));
		add(car);
		
		
		t3=new JTextField();
		t3.setBounds(200, 220, 150, 30);
		add(t3);
		
		
		JLabel model=new JLabel("Car Model");
		model.setBounds(60, 270, 100, 30);
		model.setFont(new Font("serif",Font.PLAIN,16));
		add(model);
		
		t4=new JTextField();
		t4.setBounds(200, 270, 150, 30);
		add(t4);
		
		JLabel available=new JLabel("Available");
		available.setBounds(60, 320, 100, 30);
		available.setFont(new Font("serif",Font.PLAIN,16));
		add(available);
		
		c2=new JComboBox(new String[] {"Available" , "Unavailable" , "Busy"});
		c2.setBounds(200, 320, 150, 30);
		add(c2);
		
		JLabel location=new JLabel("Location");
		location.setBounds(60, 370, 100, 30);
		location.setFont(new Font("serif",Font.PLAIN,16));
		add(location);
		
		t5=new JTextField();
		t5.setBounds(200, 370, 150, 30);
		add(t5);
		
		
		b1=new JButton("Add Driver");
		b1.setBounds(40, 430, 130, 35);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton("Cancel");
		b2.setBounds(220, 430, 130, 35);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setOpaque(true);
		b2.addActionListener(this);
		add(b2);
		
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/eleven.jpg"));
		Image i2=i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l5=new JLabel(i3);
		l5.setBounds(380, 30, 600, 420);
		add(l5);
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setBounds(300,250,1000,500);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		
		if(ae.getSource()==b1) {
			
			String name=t1.getText();
			String age=t2.getText();
			String gender=(String)c1.getSelectedItem();
			String company=t3.getText();
			String brand=t4.getText();
			String available=(String)c2.getSelectedItem();
			String location=t5.getText();
			
			
			conn c=new conn();
			
			String str="insert into driver values('"+name+"' ,'"+age+"' , '"+gender+"' , '"+company+"' , '"+brand+"' , '"+available+"' , '"+location+"')";
			try {
				
				c.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null, "NEW DRIVER ADDED");
				this.setVisible(false);
				
			}catch(Exception e){
				
				System.out.println(e);
				
			}
			
		}else if(ae.getSource()==b2){
			
			this.setVisible(false);
			
		}
		
		
	}

	public static void main(String[] args) {
		
		new AddDrivers().setVisible(true);
		
			

	}

}
