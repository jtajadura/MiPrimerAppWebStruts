<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mostrar campos</title>
</head>
<body>

<h1>
<%
//SIN USAR FORMULARIO

//Opcion 1
//String nombre = (String) request.getAttribute("nombre");
//String apellido = (String) request.getAttribute("apellido");

//Opcion 2
//out.println(request.getAttribute("nombre"));
//out.println(request.getAttribute("apellido"));
%>
<!-- Usando FORMULARIO -->
<bean:write name="visualizarDatosForm" property="nombre"/>
<bean:write name="visualizarDatosForm" property="apellido"/>

</h1>

</body>
</html>