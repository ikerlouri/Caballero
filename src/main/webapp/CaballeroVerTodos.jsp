<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="stylesheet" href="PanelDeControl.css">
<title>Panel de Control Caballero</title>
</head>
<body>
	<header> </header>
	<div class="col-md-9 tabla">
		<table class="table table-responsive table-striped">
			<thead>
				<tr>
					<th scope="col">Caballero</th>
					<th scope="col">Nombre</th>
					<th scope="col">Fuerza</th>
					<th scope="col">Experiencia</th>
					<th scope="col">Foto</th>
					<th scope="col">Arma</th>
					<th scope="col">Escudo</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${caballeros}" var="caballero">
					<tr>
						<td id="${caballero.id}">${caballero.id}</td>
						<td>${caballero.nombre}</td>
						<td>${caballero.fuerza}</td>
						<td>${caballero.experiencia}</td>
						<td>${caballero.foto}</td>
						<td>${caballero.arma.nombre}</td>
						<td>${caballero.escudo.nombre}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>