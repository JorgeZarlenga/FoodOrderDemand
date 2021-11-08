package br.com.fiap.foodOrderDemand.business;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.foodOrderDemand.dao.RestauranteDAO;
import br.com.fiap.foodOrderDemand.model.Restaurante;

public class RestauranteBusiness {
	public void cadastrar(Restaurante rb) {
		//System.out.println("rb" + rb);
		RestauranteDAO rdao = new RestauranteDAO();
		rdao.add(rb);
		
	}
}

