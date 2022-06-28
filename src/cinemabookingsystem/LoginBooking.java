package cinemabookingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginBooking implements ActionListener  {
      
    	 public JFrame f;
    	 public JLabel u,p,str;
    	 public JTextField u1;
    	 public JPasswordField p1;
    	 public JButton l,r;
    	 public JCheckBox c;
    	 public Font fo;
    	   
    	   public LoginBooking() {
    	   fo = new Font("SansSerif", Font.BOLD, 20);
    	   f = new JFrame();
    	   
    	   u = new JLabel("USERNAME");
    	   p = new JLabel("PASSWORD");
    	   u1 = new JTextField(20);
    	   p1 = new JPasswordField(20);
    //	   l1 = new JLabel("");
   	//	   ImageIcon AdminLoginIcon = new ImageIcon("log.png");
   	//	   Image scaledAdminImage = AdminLoginIcon.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
   	//	   l1 = new JLabel(new ImageIcon(scaledAdminImage));
    	   l = new JButton("LOGIN");
    	   r = new JButton("RESET");
    	   c = new JCheckBox("Show Password");
    	   str = new JLabel("ADMIN LOGIN");
    	   
   		  
   		   str.setBounds(120,1,150,100);
   		 //l1.setBounds(100,5,150,150);
    	   u.setBounds(80,100,100,30);
    	   u1.setBounds(185,100,130,30);
    	   p.setBounds(80,150,100,30);
    	   p1.setBounds(185,150,130,30);
    	   c.setBounds(80,200,120,30);
    	   l.setBounds(80,250,100,30);
    	   r.setBounds(195,250,100,30);
    	   Color mycolor = new Color(3,166,200,100);           //setting background color
   		   f.getContentPane().setBackground(mycolor);
    	  
   		   l.addActionListener(this);
  	       r.addActionListener(this);
  	       c.addActionListener(this);
    	   
    	   f.add(str);
    	//   f.add(l1);
    	   f.add(u);
    	   f.add(u1);
    	   f.add(p);
    	   f.add(p1);
    	   f.add(c);
    	   f.add(l);
    	   f.add(r);
    	  
    	   
    	   str.setFont(fo);
           
   	        
       	//   f.setBackground(Color.BLUE);
    	   f.setTitle("Login");
       	   f.setSize(400,400);
       	   f.setLocationRelativeTo(null);
       	   f.setResizable(false);
       	   f.setLayout(null);
       	   f.setVisible(true);
       	   
       }
       
    	   
    		public void actionPerformed(ActionEvent e) {
    			if(e.getSource()==l) {
    				if(u1.getText().equalsIgnoreCase("admin") && p1.getText().equalsIgnoreCase("123")) {
    					JOptionPane.showMessageDialog(f, "Login Successful");
    					new booking();
    				}
    				else {
    					JOptionPane.showMessageDialog(f, "Wrong Credentials,try again");
    				}
    			}
    				if(e.getSource()==r) {
    					u1.setText("");
    					p1.setText("");
    				}
    				if(e.getSource()==c) {
    					if(c.isSelected()) {
    						p1.setEchoChar('\u0000');
    					}
    					else {
    						p1.setEchoChar('*');
    					}
    				}
    				
    		}
       
       public static void main(String args[]) {
    	   SwingUtilities.invokeLater(new Runnable() {
    		   public void run() {
    			   new LoginBooking();
    		   }
    	   });
       }
}
