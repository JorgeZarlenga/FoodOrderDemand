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

	<div class="container" class="home">		
		
		<h1>Cadastro de Restaurante</h1>
		<form action="exibirRestaurante" method="post">
			<div>
				<label for="id-nome-restaurante">Nome do Restaurante:</label>
				<input type="text" name="nome-restaurante" id="id-nome-restaurante">
			</div>
			<div>
				<label for="id-cep">CEP:</label>
				<input type="text" name="cep" id="id-cep">
			</div>
			<div>
				<label for="id-numero-logradouro">Número:</label>
				<input type="text" name="numero-logradouro" id="id-numero-logradouro">
			</div>
			<div>
				<label for="id-hora-inicio-funcionamento">Hora de início do funcionamento:</label>
				<input type="time" name="hora-inicio-funcionamento" id="id-hora-inicio-funcionamento">
			</div>
			<div>
				<label for="id-hora-termino-funcionamento">Hora de término do funcionamento:</label>
				<input type="time" name="hora-termino-funcionamento" id="id-hora-inicio-funcionamento">
			</div>
			<div>
				<label for="id-categoria">Categoria:</label>
				<input type="text" name="categoria" id="id-categoria">
			</div>
			<div>
				<label for="id-avaliacao">Avaliação (0 - 10):</label>
				<input type="text" name="avaliacao" id="id-avaliacao">
			</div>
			<div>
				<label for="id-quantidade-cozinheiros">Quantidade de cozinheiros:</label>
				<input type="text" name="quantidade-cozinheiros" id="id-quantidade-cozinheiros">
			</div>
			<div>
				<label for="id-quantidade-entregadores">Quantidade de entregadores:</label>
				<input type="text" name="quantidade-entregadores" id="id-quantidade-entregadores">
			</div>
			<div>
				<label for="id-raio-atuacao-km">Raio de atuação (km):</label>
				<input type="text" name="raio-atuacao-km" id="id-raio-atuacao-km">
			</div>
			<input type="submit" value="Cadastrar">
		</form>
	</div>
</body>
</html>