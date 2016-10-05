<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="person" scope="session" class="myapp.Person" >
    <p>Nouvelle personne !</p>
</jsp:useBean>
<table>
	<tr>
		<th>ID
		</th>
		<th>Nom</th>
		<th>Prenom</th>
	</tr>
	<tr>
		<td>
		<%= person.getPersonID() %>
		</td>
		<td>
		<%= person.getNom() %>
		</td>
		<td>
		<%= person.getPrenom() %>
		</td>
	</tr>

</table>
</body>
</html>