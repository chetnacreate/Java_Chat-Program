package GroupChatting;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


/*here we use bufferwirtter to send the messages
 * 
 */

import javax.swing.*;
public  class user1 extends JFrame implements ActionListener {
																				 	
																				
																
					JPanel p2;													 
					JTextField t1;												
					JButton b1;												

					 static JTextArea a1;												
					BufferedWriter writer;
					
			user1(){												
				     
					p2=new JPanel();
					p2.setLayout(null);
						p2.setBackground(new Color(27,41,110));  	
						p2.setBounds(0,0,400,60);    				
						add(p2);
						
					
																					
					ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("chatting/icon/11 (2).png")); 
					Image I2= I1.getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT);
					ImageIcon  I3= new ImageIcon(I2);
					JLabel l1= new JLabel(I3);
																				 
					l1.setBounds(5,15,40,30);									
					p2.add(l1);													
					
					l1.addMouseListener(new MouseAdapter(){						
						public void mouseClicked(MouseEvent ae) {				
							System.exit(0);
						}
					});
					
					
					ImageIcon I4= new ImageIcon(ClassLoader.getSystemResource("chatting/icon/11 (1).png")); 
					Image I5= I4.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
					ImageIcon  I6= new ImageIcon(I5);
					JLabel l2= new JLabel(I6);
					l2.setBounds(50,10,40,40);
					p2.add(l2);	
					
					JLabel l3= new JLabel(" Tum hi ho ");	
					l3.setFont(new Font("SAN_SERIF",Font.BOLD,18)); 				 
					l3.setForeground(Color.white);
					l3.setBounds(110,10,100,20);
					p2.add(l3);
					
					
					JLabel l4= new JLabel(" Vanshika,Ishika,Chetna ");	
					l4.setFont(new Font("SAN_SERIF",Font.BOLD,10));					   
					l4.setForeground(Color.white);
					l4.setBounds(112,28,100,18);
					p2.add(l4);
					
					
					ImageIcon I7= new ImageIcon(ClassLoader.getSystemResource("chatting/icon/video.png")); 
					Image I8= I7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
					ImageIcon  I9= new ImageIcon(I8);
					JLabel l5= new JLabel(I9);
					l5.setBounds(280,14,30,30);
					p2.add(l5);	
					
					
					ImageIcon I10= new ImageIcon(ClassLoader.getSystemResource("chatting/icon/phone.png")); 
					Image I11= I10.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
					ImageIcon  I12= new ImageIcon(I11);
					JLabel l6= new JLabel(I12);
					l6.setBounds(320,14,30,30);
					p2.add(l6);	
					
					
					ImageIcon I13= new ImageIcon(ClassLoader.getSystemResource("chatting/icon/3icon.png")); 
					Image I14= I13.getImage().getScaledInstance(10, 20, Image.SCALE_DEFAULT);
					ImageIcon  I15= new ImageIcon(I14);
					JLabel l7= new JLabel(I15);
					l7.setBounds(360,20,10,20);
					p2.add(l7);	
					
					
					a1 = new JTextArea();
					a1.setBounds(5,70,390,470);
					a1.setBackground(Color.GRAY);
					a1.setFont(new Font("SAN_SERIF",Font.ITALIC,14));	
					a1.setForeground(Color.WHITE);
					a1.setEditable(false);
					a1.setLineWrap(true);
					a1.setWrapStyleWord(true);
					add(a1);
					
					
					
					t1=new JTextField();
					t1.setBounds(5,550,315,40);
					t1.setFont(new Font ("SAN_SERIF",Font.ITALIC,18));
					add(t1);
					
					b1= new JButton("Send");
					b1.setFont(new Font("SAN_SERIF",Font.BOLD,12));	
					b1.setForeground(Color.WHITE);
					b1.setBackground(new Color(27,41,110));
					b1.setBounds(325,550,70,40);
					b1.addActionListener(this);										
					add(b1);
					
					
					getContentPane().setBackground(Color.gray);
					setLayout(null);  												
					setSize(400,600);												
					setLocation(300,100);											
																					
					setUndecorated(true);											
					setVisible(true);												
																					
						try {
							Socket s=new Socket("Localhost",2001);
							writer= new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
						}
						catch(Exception e){
							
						}
																						
					}
					
					public void actionPerformed(ActionEvent ae) {
							String str= "Ishika\n"+ t1.getText()+"\n";
							try {
								writer.write(str);
								writer.flush();
							}catch(Exception e) {
								
							}
						 }				
					
					public static void main (String[] args) {						
						new user1().setVisible(true);
					 											
					}
				}

