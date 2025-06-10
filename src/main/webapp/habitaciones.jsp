<%@page import="com.ipartek.modelo.I_Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ipartek.modelo.dto.Habitacion"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
List<Habitacion> listaHabitaciones = new ArrayList();
if(request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES) != null){
	listaHabitaciones = (List<Habitacion>)request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES);
}
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Hotel Izar Gorena</title>
    <link rel="stylesheet" href="styles/style_productos.css" >
    <link rel="stylesheet" href="styles/style.css" >
    <script src="https://kit.fontawesome.com/3f4088c47c.js" crossorigin="anonymous"></script>
</head>
<body>
    
    <%@include file="includes/cabecera.jsp" %>

   	<%@include file="includes/menu.jsp" %>

    <main class="habitaciones">
       
       <table border=1>
       		<thead>
       			<tr>
       				<th>Nº habitación</th>
       				<th>Metros</th>
       				<th>Precio</th>
       				<th>Nº Camas</th>
       				<th>Exterior</th>
       			</tr>
       		
       		</thead>
       
       		<tbody>
       			
       			<%for(Habitacion elem : listaHabitaciones) {%>
       			<tr>
       				<td><%=elem.getNum_habitacion() %></td>
       				<td><%=elem.getMetros()%>m²</td>
       				<td><%=elem.getPrecio() %>€</td>
       				<td><%=elem.getNum_camas() %></td>
       				<td><%=elem.isExterior()? "Si" : "No"%> </td>
       			</tr>
       		    		
       		    <%} %>
       		</tbody>
       
       </table>
    </main>

   	<%@include file="includes/pie.jsp" %>

</body>
</html>