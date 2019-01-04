package com.infinite.service.chatbotweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class SubmitServlet extends HttpServlet {

	static int counter = 0;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respence) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userMessage = request.getParameter("userMessage");
		serviceImps imps = new serviceImps();
		String botMessage = imps.getQuery(userMessage);
		
		//if not find and result
		if(botMessage == null ) {
			botMessage = "Sorry! I am not gatting";
		}
		
		
		
		
		HttpSession session = request.getSession();
		Map messages = (Map)session.getAttribute("messages");
		
		
		if(messages == null) {
			Map map = new LinkedHashMap<>();
			ArrayList arrayList = new ArrayList<>();
			arrayList.add(userMessage);
			arrayList.add(botMessage);
			map.put(++counter, arrayList);
			session.setAttribute("messages", map);
			session.setAttribute("counter", counter);
			
			session.setAttribute("userName", request.getParameter("userName"));
			//System.out.println(session.getAttribute("counter"));
		}
		
		if(messages != null){
			ArrayList arrayList = new ArrayList<>();
			arrayList.add(userMessage);
			arrayList.add(botMessage);
			System.out.println(userMessage  + "   "+ botMessage);
			messages.put(++counter, arrayList);
			session.setAttribute("counter", counter);
			}
			
		
		//System.out.println(session.getAttribute("counter"));
		RequestDispatcher rd =request.getRequestDispatcher("Messanger2.jsp");	
		rd.forward(request,response);
	
	}
}
