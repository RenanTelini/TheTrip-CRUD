package br.com.crud.dao; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Contatos;

public class ContatosDAO {
	
	public void save(Contatos contato) {

		String sql = "INSERT INTO Contatos(Email_Contato, Telefone_Contato)" + "VALUES(?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getEmail_Contato());
			pstm.setString(2, contato.getTelefone_Contato());

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

	public void removeById(int Id_Contato) {
		String sql = "DELETE FROM Contatos WHERE Id_Contato = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, Id_Contato);

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

	public void update(Contatos contato) {
		String sql = "UPDATE Contatos SET Email_Contato = ?, Telefone_Contato = ? WHERE id_Contato = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getEmail_Contato());
			pstm.setString(2, contato.getTelefone_Contato());

			pstm.setInt(3, contato.getId_Contato());

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

	public List<Contatos> getContatos() {

		String sql = "SELECT * FROM Contatos";

		List<Contatos> contatos = new ArrayList<Contatos>();

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
				Contatos contato = new Contatos();

				// Recupera o id do banco e atribui ele ao objeto
				contato.setId_Contato(rset.getInt("Id_Contato"));

				// Recupera o nome do banco e atribui ele ao objeto
				contato.setEmail_Contato(rset.getString("Email_Contato"));

				// Recupera a idade do banco e atribui ele ao objeto
				contato.setTelefone_Contato(rset.getString("Telefone_Contato"));

				// Adiciona o contato recuperado, a lista de contatos
				contatos.add(contato);
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
		return contatos;
	}
}
