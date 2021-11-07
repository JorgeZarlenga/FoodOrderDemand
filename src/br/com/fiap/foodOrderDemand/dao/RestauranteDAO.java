package br.com.fiap.foodOrderDemand.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.foodOrderDemand.model.Restaurante;

public class RestauranteDAO implements IDataHandler<Restaurante> {

	@Override
	public List<?> getAll() {

		DAO dao = new DAO();
		List<Restaurante> listP = new ArrayList<Restaurante>();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_RESTAURANTE");
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				Restaurante r = new Restaurante();
				r.setCodRestaurante(result.getInt("CD_RESTAURANTE"));
				r.setNomeRestaurante(result.getString("NM_RESTAURANTE"));
				r.setNumeroCep(result.getInt("NR_CEP"));
				r.setNumeroLogradouro(result.getInt("NR_LOGRADOURO"));
				// r.setHoraInicioFuncionamento(result.getDate(new LocalDateTime));
				// r.setHoraTerminoFuncionamento(result.getDate(new LocalDateTime));
				r.setCategoriaRestaurante(result.getString("NM_CATEGORIA"));
				r.setAvaliacao(result.getInt("NR_AVALIACAO"));
				r.setQuantidadeCozinheiros(result.getInt("NR_COZINHEIROS"));
				r.setQuantidadeEntregadores(result.getInt("NR_ENTREGADORES"));
				r.setRaioAtuacaoKm(result.getDouble("NR_RAIO"));
				listP.add(r);
			}
			return listP;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Restaurante getById(int id) {

		DAO dao = new DAO();
		PreparedStatement stmt;

		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_RESTAURANTE WHERE CD_RESTAURANTE = ?");
			stmt.setInt(1, id);
			ResultSet result = null;
			result = dao.getData(stmt);
			while (result.next()) {
				Restaurante r = new Restaurante();
				r.setCodRestaurante(result.getInt("CD_RESTAURANTE"));
				r.setNomeRestaurante(result.getString("NM_RESTAURANTE"));
				r.setNumeroCep(result.getInt("NR_CEP"));
				r.setNumeroLogradouro(result.getInt("NR_LOGRADOURO"));
				// r.setHoraInicioFuncionamento(result.getDate(new LocalDateTime));
				// r.setHoraTerminoFuncionamento(result.getDate(new LocalDateTime));
				r.setCategoriaRestaurante(result.getString("NM_CATEGORIA"));
				r.setAvaliacao(result.getInt("NR_AVALIACAO"));
				r.setQuantidadeCozinheiros(result.getInt("NR_COZINHEIROS"));
				r.setQuantidadeEntregadores(result.getInt("NR_ENTREGADORES"));
				r.setRaioAtuacaoKm(result.getDouble("NR_RAIO"));
				return r;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public int add(Restaurante obj) {

		DAO dao = new DAO();

		try {
			java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
			PreparedStatement stmt = dao.getConnection().prepareStatement(
					"INSERT INTO T_RESTAURANTE(CD_RESTAURANTE, NM_RESTAURANTE, NR_CEP, NR_LOGRADOURO, HR_INICIO, HR_TERMINO, NM_CATEGORIA, NR_AVALIACAO, NR_COZINHEIROS, NR_ENTREGADORES, NR_RAIO) VALUES (CD_RESTAURANTE.NEXTVAL,?,?,?,?,?,?,?,?,?,?)");
			stmt.setNomeRestaurante(1, );
			stmt.setNumeroCep(2, );
			stmt.setNumeroLogradouro(3, );
			// stmt.setHoraInicioFuncionamento();
			// stmt.setHoraTerminoFuncionamento();
			stmt.setCategoriaRestaurante(4, );
			stmt.setAvaliacao(5, );
			stmt.setQuantidadeCozinheiros(6, );
			stmt.setQuantidadeEntregadores(7, );
			stmt.setRaioAtuacaoKm(8, );
			return dao.executeCommand(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int delete(int id) {

		DAO dao = new DAO();

		try {
			PreparedStatement stmt = dao.getConnection()
					.prepareStatement("DELETE FROM T_RESTAURANTE WHERE CD_RESTAURANTE = ?");
			stmt.setInt(1, id);
			return dao.executeCommand(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int update(Restaurante obj) {

		DAO dao = new DAO();
		
		try {
			PreparedStatement stmt = dao.getConnection()
					.prepareStatement("UPDATE T_RESTAURANTE SET NM_RESTAURANTE = ? WHERE CD_RESTAURANTE = ?");
			stmt.setString(1, obj.getNomeRestaurante());
			stmt.setInt(2, 1);
			return dao.executeCommand(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;

	}
}