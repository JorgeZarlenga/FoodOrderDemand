<%@page import="br.com.fiap.foodOrderDemand.model.Restaurante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="listaRestaurantes" class="java.util.ArrayList" scope="request"></jsp:useBean>

<!doctype html>
<html lang="pt-BR">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Restaurantes</title>
  </head>
<body>

	<div class="container">
	
		<h1>Restaurantes</h1>
	
		<a href="cadastrarRestaurante" class="btn btn-primary">Novo Restaurante</a>
		
		
		<table class="table">
			<thead>
				<tr>
					<th>Nome</th>
					<th>CEP</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaRestaurantes}" var="restaurante">
					<tr>
						<td>${restaurante.nomeRestaurante}</td>
						<td>${restaurante.numeroCep}</td>
						<td>
							<a href="#" class="btn btn-success">Detalhes</a>
							<a href="#" class="btn btn-danger">Excluir</a>
							<a href="#" class="btn btn-info">Editar</a>
							<a href="#" class="btn btn-info">Insights</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>