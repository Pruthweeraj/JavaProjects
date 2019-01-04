package com.infinite.service.chatbotweb;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.infinite.service.chatbotweb.serviceImps;


public class DisServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		new Bot();
		
	}
	


	public class Bot {
		private JTextArea chatArea = new JTextArea();
		private JTextField chatBox = new JTextField();
		
		public Bot() {
			JFrame frame =new JFrame();
			//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setLayout(null);
			frame.setSize(600 ,600);
			frame.setTitle("ChatBot");
			
			frame.add(chatArea);
			frame.add(chatBox);
			//FOR TTEXTAREA
			chatArea.setSize(500 ,400);
			chatArea.setLocation(2, 2);
			
			//FOR TEXTFIELD 
			chatBox.setSize(540 , 30);
			chatBox.setLocation(2 , 500);
			
			chatBox.addActionListener(new ActionListener() {
				
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					String gText = chatBox.getText();
					String gLowerText = gText.toLowerCase();
					chatArea.append("You ->" + gText +"\n");
					chatBox.setText("");
					
					serviceImps imps = new serviceImps();
				String 	dMsg =imps.getQuery(gLowerText);
				if (dMsg == null) {
					chatArea.append("Infinite ->>" +"Sorry ! i am not getting..."+"\n");
				}
				else bot(dMsg);
					
					
				}
			});
			
			
		}
		private void bot(String string) {
			chatArea.append("Infinite ->>" +string +"\n");
		}
		
		/*public static void main(String[] args) {
			new Bot();
		}*/
	}


}
