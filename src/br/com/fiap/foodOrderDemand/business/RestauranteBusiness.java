package br.com.fiap.foodOrderDemand.business;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.foodOrderDemand.model.Restaurante;

public class RestauranteBusiness {
	
	public List<Restaurante> listarTodos() {
			
		List<Restaurante> lista = new ArrayList<Restaurante>();
		
		Restaurante restaurante = new Restaurante();
		restaurante.setCodRestaurante(1);
		restaurante.setNomeRestaurante("Teste 1");
		restaurante.setNumeroCep("08000000");
		restaurante.setNumeroLogradouro(22);
		restaurante.setHoraInicioFuncionamento(LocalDateTime.of(2015,Month.JULY, 29, 19, 30, 40));
		restaurante.setHoraInicioFuncionamento(LocalDateTime.of(2015,Month.JULY, 29, 19, 30, 40));
		restaurante.setCategoriaRestaurante("Japonês");
		restaurante.setAvaliacao(4);
		restaurante.setQuantidadeCozinheiros(5);
		restaurante.setQuantidadeEntregadores(3);
		restaurante.setRaioAtuacaoKm(4.5);
		lista.add(restaurante);
		
		restaurante = new Restaurante();
		restaurante.setCodRestaurante(2);
		restaurante.setNomeRestaurante("Teste 2");
		restaurante.setNumeroCep("08344000000");
		restaurante.setNumeroLogradouro(22);
		restaurante.setHoraInicioFuncionamento(LocalDateTime.of(2016,Month.JULY, 29, 19, 30, 40));
		restaurante.setHoraInicioFuncionamento(LocalDateTime.of(2017,Month.JULY, 29, 19, 30, 40));
		restaurante.setCategoriaRestaurante("Italiano");
		restaurante.setAvaliacao(4);
		restaurante.setQuantidadeCozinheiros(2);
		restaurante.setQuantidadeEntregadores(1);
		restaurante.setRaioAtuacaoKm(4.5);
		lista.add(restaurante);
		
		return lista;
	}

}
