package br.com.crud.factory; /*ESSE PACOTE FAZ A CONEXÃO COM O BANCO DE DADOS*/

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		
		public static Connection createConnectionSQLServer() throws Exception {
			// Faz com que a classe seja carregada pela JVM
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			
			// Cria a conexão com o banco de dados ----------------------- SEM senha
			Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=TheTrip;");
			
			return connection;
		}
		public static void main(String[] args) throws Exception{
			// Recupera uma conexão com o banco de dados
			Connection con = createConnectionSQLServer();
			
			// Testa se a conexão é nula
			if (con != null) {
				System.out.println("Conexão obtida com sucesso! " + con);
				con.close();
			}
		}
}
