package br.com.fiap.foodOrderDemand.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection connection;

	public DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection GetConnection() {
		OpenConnection();
		System.out.println("Conexao aberta com sucesso");
		return this.connection;
	}

	// Responsavel por abrir a conexao
	private void OpenConnection() {
		try {
			this.connection = DriverManager.getConnection
					  ("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM86831", "020996");
			
			System.out.println("Conectado!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void CloseConnection() {
		try {
			if (this.connection != null) {
				this.connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// resp por exec comandos SQL (insert, update, delete)
	public int ExecuteCommand(PreparedStatement stmt) {
		int j = 0;
		try {
			j = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			CloseConnection();
		}
		return j;
	}

//select 
	public ResultSet GetData(PreparedStatement stmt) {
		ResultSet resultSet = null;
		try {
			resultSet = stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
	}

	public int ExecuteProcedure(CallableStatement cs) {

		try {
			return cs.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

}
