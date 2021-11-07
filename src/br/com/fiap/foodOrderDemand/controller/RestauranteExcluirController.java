package br.com.fiap.foodOrderDemand.controller;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.foodOrderDemand.business.RestauranteBusiness;
import br.com.fiap.foodOrderDemand.model.Restaurante;

@WebServlet("/restauranteExcluir")
public class RestauranteExcluirController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RestauranteExcluirController() {
        super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("id"));
		
		Restaurante Restaurante = new RestauranteBusiness().pesquisarPorId(codigo);
		
		
		request.setAttribute("Restaurante", Restaurante);
		request.setAttribute("listaPerfilRisco", new PerfilRiscoBusiness().listarTodos());
		
		RequestDispatcher rd = request.getRequestDispatcher("Restaurante-editar.jsp");  
		rd.forward(request, response);
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Restaurante forneModel = new Restaurante();
		
		try { 
			
			NumberFormat nf = NumberFormat.getInstance(Locale.UK);
			double valor = nf.parse(request.getParameter("valorPatrimonio")).doubleValue();
			
			forneModel.setCnpj(request.getParameter("cnpj"));
			forneModel.setNome(request.getParameter("nome"));
			forneModel.setDataContrato(new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataContrato")));
			forneModel.setValorPatrimonio(valor);
			forneModel.setEmpresaNacional("on".equals(request.getParameter("empresaNacional")) ? true : false);
			
			
			//RestauranteDao.inserir(forneModel);
			// INSERT 
			
			request.setAttribute("Restaurante", forneModel);

			RequestDispatcher rd = request.getRequestDispatcher("restaurante-editar-sucesso.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
