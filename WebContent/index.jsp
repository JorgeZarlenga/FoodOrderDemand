<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />

<title>Insights</title>
</head>
<body>

<<<<<<< HEAD
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
=======
<a href="listarRestaurantes" class="btn btn-success">Mostrar restaurantes</a>

>>>>>>> 9d57843fe0834ef42435d031356a88fa4826b00e
</body>
</html>