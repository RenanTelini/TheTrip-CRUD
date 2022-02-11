package br.com.crud.dao; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Clientes;
import br.com.crud.model.Contatos;
import br.com.crud.model.Destinos;
import br.com.crud.model.Promocoes;

public class ClientesDAO {
	
	public void save(Clientes cliente) {

		String sql = "INSERT INTO Clientes(Nome_Cliente, Cidade_Cliente, Estado_Cliente, ContatoId_Contato, "
				+ "DestinoId_Destino, PromocaoId_Promocao)" + "VALUES(?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cliente.getNome_Cliente());
			pstm.setString(2, cliente.getCidade_Cliente());
			pstm.setString(3, cliente.getEstado_Cliente());
			pstm.setInt(4, cliente.getId_Contato());
			pstm.setInt(5, cliente.getId_Destino());
			pstm.setInt(6, cliente.getId_Promocao());
			
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

	public void removeById(int Id_Cliente) {
		String sql = "DELETE FROM Clientes WHERE Id_Cliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, Id_Cliente);

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

	public void update(Clientes cliente) {
		String sql = "UPDATE Clientes SET Nome_Cliente = ?, Cidade_Cliente = ?, Estado_Cliente = ?, "
				+ "ContatoId_Contato = ?, DestinoId_Destino = ?, PromocaoId_Promocao = ? WHERE Id_Cliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cliente.getNome_Cliente());
			pstm.setString(2, cliente.getCidade_Cliente());
			pstm.setString(3, cliente.getEstado_Cliente());
			
			pstm.setInt(4, cliente.getId_Contato()); //Chave estrangeira da classe Contato
			pstm.setInt(5, cliente.getId_Destino()); //Chave estrangeira da classe Destino
			pstm.setInt(6, cliente.getId_Promocao()); //Chave estrangeira da classe Promocoes
			
			pstm.setInt(7, cliente.getId_Cliente()); //Id da própria classe Clientes
			
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

	public List<Clientes> getClientes() {

		String sql = "SELECT cli.Id_Cliente, cli.Nome_Cliente, cli.Cidade_Cliente, cli.Estado_Cliente,\n"
				+ "c.Email_Contato, c.Telefone_Contato, ds.Cidade_Destino, ds.Estado_Destino,\n"
				+ "p.Valor_Promocao FROM Clientes as cli\n"
				+ "inner join Contatos as c on cli.ContatoId_Contato = c.Id_Contato\n"
				+ "inner join Destinos as ds on cli.DestinoId_Destino = ds.Id_Destino\n"
				+ "inner join Promocoes as p on cli.PromocaoId_Promocao = p.Id_Promocao";

		List<Clientes> clientes = new ArrayList<Clientes>();

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
				Clientes cliente = new Clientes();
				Contatos contato = new Contatos();
				Destinos destino = new Destinos();
				Promocoes promocao = new Promocoes();

				cliente.setId_Cliente(rset.getInt("Id_Cliente"));
				cliente.setNome_Cliente(rset.getString("Nome_Cliente"));
				cliente.setCidade_Cliente(rset.getString("Cidade_Cliente"));		
				cliente.setEstado_Cliente(rset.getString("Estado_Cliente"));
				
				contato.setEmail_Contato(rset.getString("Email_Contato"));
				contato.setTelefone_Contato(rset.getString("Telefone_Contato"));
				
				destino.setCidade_Destino(rset.getString("Cidade_Destino"));
				destino.setEstado_Destino(rset.getString("Estado_Destino"));
				
				promocao.setValor_Promocao(rset.getFloat("Valor_Promocao"));
				
				cliente.setContato(contato); //Guardando Email_Contato e Telefone_Contato em "cliente"
				cliente.setDestino(destino); //Guardando Cidade_Destino e Estado_Destino em "cliente"
				cliente.setPromocao(promocao); //Guardando Valor_Promocao em "cliente"

				// Adiciona o cliente recuperado, a lista de clientes
				clientes.add(cliente); //Adicionando o valor de "cliente" à "clientes"
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
		return clientes;
	}
}
