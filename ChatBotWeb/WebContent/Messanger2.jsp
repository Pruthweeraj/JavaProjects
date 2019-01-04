<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
      <title>Infinite ChatBox</title>
      <link rel="stylesheet" type="text/css" href="style.css">
     <marquee direction="left to right"><welcome to my chat UI></marquee> 
</head>


<body bg color="red">
		<!--  	<marquee direction="left to right"><img src="C:\Users\JOGINDRA\Desktop">welcome to my chat UI</marquee>  -->

<form  action = "submit" method= "post" >
	
      <div class="chatbox">
           <div class="chatlogs">

              


<%
response.setContentType("text/html");
String name = request.getParameter("username");
String userName = (String)session.getAttribute("un");
if(userName == null){
	session.setAttribute("un",name);
	//name added to session;
}
  %>

	 <div class="chat infinite">

     <div class="user-photo"><img src="infinite.png"></div>
      <p class="chat-message">Welcome...<%= (String)session.getAttribute("un") %>  :)<p>
</div>
<%


Map map = (Map)session.getAttribute("messages");


Object counter = session.getAttribute("counter");
if(counter != null){
 	int count  = (int)counter;
//for( int i =1 ; i<= (int)counter ; i++){
	if((int)counter != 0){
			if(map != null){
				Iterator<Map.Entry<Number, Object>> itr = map.entrySet().iterator(); 
				while(itr.hasNext()) 
				{ 
     				Map.Entry<Number, Object> entry = itr.next(); 
 						 ArrayList arrayList = (ArrayList)(entry.getValue());
%>
	
	<div class="chat user">

             <div class="user-photo"><img src=user.jpg></div>
              <p class="chat-message"><%= arrayList.get(0) %></p>
       </div>
	
			 <div class="chat infinite">

             <div class="user-photo"><img src="infinite.png"></div>
              <p class="chat-message"><%= arrayList.get(1) %><p>
       </div>
        
<% 
				}
			}
	}
}
			
%>



</div>
<div class="chat-form">
	<textarea name = "userMessage" placeholder="Enter the message"></textarea>
	<button name = "submit"  value = "submit">Send</button>
</div>
</div>

</form>
</body>
</head>
</html>