package br.com.fiap.foodOrderDemand.business;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.foodOrderDemand.model.Insight;

public class InsightBusiness {
	
	public List<Insight> listarTodos() {
		
		List<Insight> lista = new ArrayList<Insight>();
		
		Insight insight = new Insight();
		insight.setInsight1("Teste 1");
		insight.setInsight2("Teste 2");
		insight.setInsight3("Teste 3");

		lista.add(insight);

		return lista;
	}
}
