package com.chatbot.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.infinite.service.chatbotweb.serviceImps;



public class admin {
	static int n = 1;
		private JTextArea chatArea = new JTextArea();
		private JTextField chatBox = new JTextField();
		
		public admin() {
			JFrame frame =new JFrame();
			//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setLayout(null);
			frame.setSize(600 ,600);
			frame.setTitle("ADMIN_BOT");
			
			frame.add(chatArea);
			frame.add(chatBox);
			//FOR TTEXTAREA
			chatArea.setSize(500 ,400);
			chatArea.setLocation(2, 2);
			
			//FOR TEXTFIELD 
			chatBox.setSize(540 , 30);
			chatBox.setLocation(2 , 500);
			
			
			chatBox.addActionListener(new ActionListener() {
				
				String u1,u2,u3,b1,b2,b3;
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					String gText = chatBox.getText();
					String gLowerText = gText.toLowerCase();
					if(n == 1) {
					chatArea.append("YourText1 ->" + gText +"\n");
					chatBox.setText("");
					 u1 = gLowerText;
					
					}
					if (n == 2) {
						chatArea.append("YourText2->>" + gText +"\n");
						chatBox.setText("");
						 u2 = gLowerText;
						
					}
					if (n == 3) {
						chatArea.append("YourText3->>" + gText +"\n");
						chatBox.setText("");
						 u3 = gLowerText;
						
					}
					if (n == 4) {
						chatArea.append("Infinite1->>" + gText +"\n");
						chatBox.setText("");
						 b1 = gLowerText;
						
					}
					if (n == 5) {
						chatArea.append("Infinite2->>" + gText +"\n");
						chatBox.setText("");
						 b2 = gLowerText;
						
					}
					
					if (n == 6) {
						chatArea.append("Infinite3->>" + gText +"\n");
						chatBox.setText("");
						 b3 = gLowerText;
						
						 serviceImps imps = new serviceImps();
							String [] databaseAddMsg = {u1,u2,u3,b1,b2,b3};
							String report= imps.addQuery(databaseAddMsg);
							chatArea.append(report+"\n");
					}
					 n++;
					 if( n == 7) {
						 n= 1;
					 }
				}
			});
			
			
		}
		
		public static void main(String[] args) {
			new admin();
			
			 
		}
		}


