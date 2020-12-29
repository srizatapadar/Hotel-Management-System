package hotel.management.system;

import java.awt.*;

import java.awt.event.*;
import java.sql.*;

import javax.swing.*;



public class AddEmployee extends JFrame implements ActionListener{
	
	
	
	
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton r1,r2;
	JComboBox c1;
	JButton b1;
	
	
	AddEmployee(){
		
		
		
		JLabel name=new JLabel("NAME");
		name.setBounds(60, 30, 120, 30);
		add(name);       
		
		t1=new JTextField();
		t1.setBounds(200, 30, 160, 30);
		t1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(t1);
		
		
		
		
		JLabel age=new JLabel("AGE");
		age.setBounds(60, 80, 120, 30);
		add(age);       
		
		t2=new JTextField();
		t2.setBounds(200, 80, 160, 30);
		t2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(t2);
		
		
		
		JLabel gender=new JLabel("GENDER");
		gender.setBounds(60, 130, 120, 30);
		add(gender);       
		
		r1=new JRadioButton("MALE");
		r1.setBounds(200, 130, 100, 30);
		r1.setFont(new Font("serif",Font.PLAIN,12));
		r1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(r1);
		
		r2=new JRadioButton("FEMALE");
		r2.setBounds(290, 130, 100, 30);
		r2.setFont(new Font("serif",Font.PLAIN,12));
		r2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(r2);
		
		
		
		
		JLabel job=new JLabel("JOB");
		job.setBounds(60, 180, 120, 30);
		add(job);       
		
		String str[]= {"Frontdesk Clerks","Forters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
		c1=new JComboBox(str);
		c1.setBounds(200, 180, 170, 30);
		
		add(c1);
		
		
		
		
		JLabel salary=new JLabel("SALARY");
		salary.setBounds(60, 230, 120, 30);
		add(salary);       
		
		t3=new JTextField();
		t3.setBounds(200, 230, 160, 30);
		t3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(t3);
		
		
		
		JLabel phone=new JLabel("PHONE");
		phone.setBounds(60, 280, 120, 30);
		add(phone);       
		
		t4=new JTextField();
		t4.setBounds(200, 280, 160, 30);
		t4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(t4);
		
		
		
		JLabel adhar=new JLabel("AADHAR");
		adhar.setBounds(60, 330, 120, 30);
		add(adhar);       
		
		t5=new JTextField();
		t5.setBounds(200, 330, 160, 30);
		t5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(t5);
		
		
		
		JLabel email=new JLabel("EMAIL ID");
		email.setBounds(60, 380, 120, 30);
		add(email);       
		
		t6=new JTextField();
		t6.setBounds(200, 380, 160, 30);
		t6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		add(t6);
		
		
		
		JButton b11=new JButton("Submit");
		b11.setBackground(Color.BLACK);
		b11.setForeground(Color.WHITE);
		b11.setOpaque(true);
		b11.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		b11.setBounds(50, 470,130, 30);
		b11.addActionListener(this);
		add(b11);
		
		
		JButton b2=new JButton("Cancel");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setOpaque(true);
		b2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		b2.setBounds(250, 470,130, 30);
		b2.addActionListener(this);
		add(b2);
		
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/tenth.jpg"));
		Image i2=i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(425, 20, 500, 600);
		add(l1);
		
		
		JLabel l2=new JLabel("ADD EMPLOYEE DETAILS");
		l2.setBounds(400, 20, 500, 30);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("serif",Font.BOLD,30));
		add(l2);
		
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
		
		setLayout(null);
		setBounds(320,200, 950,550);
		setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
		 
		String name=t1.getText();
		String age=t2.getText();
		String salary=t3.getText();
		String phone=t4.getText();
		String adhar=t5.getText();
		String email=t6.getText();
		
		
		String gender=null;
		
		if(r1.isSelected()) {
			
			gender="Male";
		}else if(r2.isSelected()) {
			
			gender="Female";
		}
		
		
		String job=(String)c1.getSelectedItem();
		
		
		conn c=new conn();
		String str="insert into employee values('"+name+"' ,'"+age+"' , '"+gender+"' , '"+job+"' , '"+salary+"' , '"+phone+"' , '"+adhar+"' , '"+email+"' )";
		
		
		try {
			
			c.s.executeUpdate(str);
			JOptionPane.showMessageDialog(null, "NEW EMPLOYEE ADDED");
			this.setVisible(false);
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
	}
	
	public static void main(String[] args) {
		
		new AddEmployee().setVisible(true);
	}

}
