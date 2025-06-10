<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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

    <main class="servicios">
    	<section>
    	
    		<h2>Servicios generales</h2>
	       <ul class="lista_servicios">
	       
	       		<li><i class="fa-solid fa-language"></i> Recepción 24 horas con servicio de conserjería multilingüe</li>
	       		<li><i class="fa-solid fa-utensils"></i> Servicio de habitaciones disponible 24/7</li>
	       		<li><i class="fa-solid fa-cart-flatbed-suitcase"></i> Portería y botones para asistencia con maletas y transporte interno</li>	       		      		
	       		<li><i class="fa-solid fa-hand-sparkles"></i> Servicio de limpieza y turn‑down service</li>
	       		<li><i class="fa-solid fa-handshake"></i> Salas de reuniones y eventos, equipadas y con asistencia técnica</li>
	       		<li><i class="fa-solid fa-desktop"></i> Business center con ordenadores, impresora y servicio secretarial</li>
	       		
	       </ul>
       
       		<h2>Servicios de restauración</h2>
       		<ul class="lista_servicios">
       		
       			<li><i class="fa-solid fa-bowl-food"></i> Restaurante gourmet con cocina de autor y menús exclusivos</li>
	       		<li><i class="fa-solid fa-martini-glass"></i> Bar o lounge de alta categoría para cócteles y aperitivos</li>
       		
       		</ul>
       </section>
       
       <section>
       
       		<h2>Servicios de deporte y bienestar</h2>
       		<ul class="lista_servicios">
       		
       			<li><i class="fa-solid fa-spa"></i> Spa y centro wellness (masajes, sauna, baño turco, tratamientos de belleza)</li>
	       		<li><i class="fa-solid fa-water-ladder"></i> Piscina climatizada interior y/o exterior con zona relax</li>
	       		<li><i class="fa-solid fa-dumbbell"></i> Gimnasio completamente equipado y clases dirigidas </li>
       		
       		</ul>
      
       		<h2>Servicios de transporte</h2>
       		<ul class="lista_servicios">
       		
       			<li><i class="fa-solid fa-van-shuttle"></i> Traslados/pick-up al aeropuerto, estación o puntos de interés </li>
       			<li><i class="fa-solid fa-square-parking"></i> Servicio de valet parking y aparcacoches</li>
       		
       		</ul>
       </section>
    </main>

   	<%@include file="includes/pie.jsp" %>

</body>
</html>