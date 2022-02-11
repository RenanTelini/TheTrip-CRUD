package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Destinos;

public class DestinosDAO {
	
	public void save(Destinos destino) {

		String sql = "INSERT INTO Destinos(Cidade_Destino, Estado_Destino)" + "VALUES(?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getCidade_Destino());
			pstm.setString(2, destino.getEstado_Destino());

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int Id_Destino) {
		String sql = "DELETE FROM Destinos WHERE Id_Destino = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, Id_Destino);

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Destinos destino) {
		String sql = "UPDATE Destinos SET Cidade_Destino = ?, Estado_Destino = ? WHERE Id_Destino = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getCidade_Destino());
			pstm.setString(2, destino.getEstado_Destino());
			
			pstm.setInt(3, destino.getId_Destino());
			
			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Destinos> getDestinos() {

		String sql = "SELECT * FROM Destinos";

		List<Destinos> destinos = new ArrayList<Destinos>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {
				Destinos destino = new Destinos();

				// Recupera o id do banco e atribui ele ao objeto
				destino.setId_Destino(rset.getInt("Id_Destino"));

				// Recupera o nome do banco e atribui ele ao objeto
				destino.setCidade_Destino(rset.getString("Cidade_Destino"));

				// Recupera a idade do banco e atribui ele ao objeto
				destino.setEstado_Destino(rset.getString("Estado_Destino"));

				// Adiciona o destino recuperado, a lista de destinos
				destinos.add(destino); //Adicionando o valor de "destino" à "destinos"
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return destinos;
	}
}
