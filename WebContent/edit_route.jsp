<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="model.*"%>


<% 
	HttpSession s = request.getSession();
	User user =(User) s.getAttribute("user");


%>
<html>
<head>

<link rel="stylesheet" href="./css/profile_edit.css">
 <link rel="stylesheet" type="text/css" href="./css/side_panels.css" />
 <link rel="stylesheet" type="text/css" href="./css/main.css" />
 <link rel="stylesheet" type="text/css" href="./css/header.css" />
 <title>My destinations</title>
</head>

<body>



<header>
	<ul>
		<li><a href="home.html">Home</a></li>
		<li><a href="edit_profile.html">Profile</a></li>
		<li><a href="faq.html">FAQ</a></li>		
		<li><a href="login.html">Log out</a></li>
	</ul>
</header>

<left_side>

<h1>edit_route = ${user.getID()}</h1>
	<%@ include file="user_banner.jsp" %>

</left_side> 


<div id="bg">
  <div class="module">
    <ul>
      <li class="tab sleepyTab"><a href="edit_profile.html"><img src="./images/user.png" alt="" class="icon"/></a></li>
      <li class="tab activeTab" ><a href="edit_route.html"><img src="./images/milestone.png" alt="abra" class="icon"/></a></li>
      <li class="tab sleepyTab" ><a href="edit_infos.html"><img src="./images/customers.png" alt="" class="icon"/></a></li>
      <li class="tab sleepyTab" ><a href="edit_parameters.html"><img src="./images/settings.png" alt="" class="icon"/></a></li>
    </ul>
    
    	<form class="form"  action="/SopraCarPooling/RidesUpdate" method="post">

			<%for(int i = 1; i < 6; i++){ %>
		        <table >
                    <tr>
                    
                    <input type="hidden" name="-id-1" value="-1">
                    <input type="hidden" name="-id-2" value="-1">                    
                        <td>
                            Home<br><br>
                            <input type="text" name="1-street" placeholder="Street" class="rstreetbox" /><br>
                            <input type="text" name="1-code-post" placeholder="Code" class="rcodebox" />
                            <input type="text" name="1-city" placeholder="City" class="rcitybox" />
                        </td>
                        <td >
                            Office<br><br>
					    	<select select name="1-service">
					  			<option value="dest1">Sopra1</option>
					 			<option value="dest2">Sopra2</option>
					 			<option value="dest3">Sopra3</option>
					  			<option value="dest4">Sopra4</option>
					  			<option value="dest5">Sopra5</option>
							</select>
                        </td>
                        <td>
                            <INPUT type="checkbox" name="2-aller"> Aller : 
                    		<input type="text" name="ah2" value="00" class="hourbox" />h
							<input type="text" name="am2" value="00" class="hourbox" />m<br>
                    		<INPUT type="checkbox" name="2-retour"> Retour : 
                    		<input type="text" name="rh2" value="00" class="hourbox" />h
							<input type="text" name="rm2" value="00" class="hourbox" />m
                        </td>                
                    </tr>
                 </table>
                 <textarea name="1-com" placeholder="Comment"></textarea><br>
                 
                 
               
			
              
               <%}%>
                			
 	     <input type="submit" value="Add a route" class="button" />   
   </form>
   
  </div>
</div>


</body>
<html>