package br.com.crud.main;

import br.com.crud.dao.ContatosDAO;
import br.com.crud.model.Contatos;

public class ContatosMain {

	public static void main(String[] args) {
		ContatosDAO contatoDAO = new ContatosDAO();
		
		// ------------ Cria um Contato e salva no banco
//		Contatos contato = new Contatos();
//		contato.setEmail_Contato("cleber.freitas@hotmail.com");
//		contato.setTelefone_Contato("(71) 98517-2002");
//		
//		contatoDAO.save(contato); 
//		
//		// ------------ Remove o Contato pelo id
//		contatoDAO.removeById(3);
//		
//		// ------------ Atualiza o Contato pelo número do id com os dados do objeto contato1
//		Contatos contato1 = new Contatos();
//		contato1.setId_Contato(1);
//		contato1.setEmail_Contato("qlq@gmail.com");
//		contato1.setTelefone_Contato("(68) 94315-4869");
//		
//		contatoDAO.update(contato1); 
//		
		// ------------ Lista todos os Contatos do banco de dados
		for (Contatos c : contatoDAO.getContatos()) {
			System.out.println("E-mail: " + c.getEmail_Contato() + "\n" + c.getTelefone_Contato() + "\n");
		}
	}
}
