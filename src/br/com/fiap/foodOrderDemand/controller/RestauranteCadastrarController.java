package br.com.fiap.foodOrderDemand.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.foodOrderDemand.business.RestauranteBusiness;
import br.com.fiap.foodOrderDemand.model.Restaurante;

@WebServlet("/cadastrarRestaurante")
public class RestauranteCadastrarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RestauranteCadastrarController() {
        super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		

		RequestDispatcher rd = request.getRequestDispatcher("cadastrarRestaurante.jsp");  
		rd.forward(request, response);
	}
}
