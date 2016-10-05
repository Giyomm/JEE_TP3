<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="edition" method="POST">

  <label>ID</label>
    <input type="text" name="ID" size="15" /><br/>
  <label>Nom : </label>
    <input type="text" name="nom" size="15"/><br/>

  <label>Prénom : </label>
    <input type="text" name="prenom" size="15"/><br/>

  <label>Mail : </label>
    <input type="text" name="mail" size="15"/><br/>

<label>Date de naissance : </label>
    <input type="date" name="dateNaissance" size="15"/><br/>

  <input type="submit" name="boutonOK" value="Valider"/>

</form>
</body>
</html>