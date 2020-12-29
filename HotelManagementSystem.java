package hotel.management.system;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
	
	HotelManagementSystem(){
		
		setBounds(300,200,1366,565);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/Icons/first.jpg"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(0, 0, 1366, 565);
		add(l1);
		
		
		JLabel l2=new JLabel("HOTEL MANAGEMENT SYSTEM");
		l2.setBounds(50, 450, 3000, 130);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("serif", Font.BOLD,40));
		l1.add(l2);
		
		JButton b1=new JButton("Next");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.setBounds(1100, 460, 140, 50);
		b1.addActionListener(this);
		l1.add(b1);
		
		
		setLayout(null);
		setVisible(true);
		
		/*while(true) {
			
			l2.setVisible(false);
			try {
				Thread.sleep(500);
			}catch (Exception e){
				
			}
			l2.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}*/
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		new Login().setVisible(true);
		this.setVisible(false);
		
	}
	
	
	public static void main(String[] args) {
		
		new HotelManagementSystem();

	}

}
