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

<form  action = "submit" >
	
      <div class="chatbox">
           <div class="chatlogs">

                  <div class="chat infinite">

                  <div class="user-photo"><img src="infinite.png"></div>
                   <p class="chat-message">whats ups bro,BRO<p>
            </div>

              <div class="chat user">

                  <div class="user-photo"><img src=user.jpg></div>
                   <p class="chat-message">Hlw,Whats app dude</p>
            </div>





             <div class="chat infinite">

                  <div class="user-photo"><img src="infinite.png"></div>
                   <p class="chat-message">I am fine<p>
            </div>



             <div class="chat user">

                  <div class="user-photo"><img src=user.jpg></div>
                   <p class="chat-message">What about u</p>
            </div>





             <div class="chat infinite">

                  <div class="user-photo"><img src="infinite.png"></div>
                   <p class="chat-message">I want to do something in life but i need some motivation,Can u help me?<p>
            </div>



             <div class="chat user">

                  <div class="user-photo"><img src=user.jpg></div>
                   <p class="chat-message">Sure,Why not</p>
            </div>



            <div class="chat infinite">

                  <div class="user-photo"><img src="infinite.png"></div>
                   <p class="chat-message">Now i am studying java now if i found time then,i will come to u<p>
            </div>



             <div class="chat user">

                  <div class="user-photo"><img src=user.jpg></div>
                   <p class="chat-message">Okk then gd ni8..</p>
            </div>


<%
 

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