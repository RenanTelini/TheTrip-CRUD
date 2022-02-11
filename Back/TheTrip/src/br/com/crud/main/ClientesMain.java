package br.com.crud.main;

import br.com.crud.dao.ClientesDAO;
import br.com.crud.model.Clientes;

public class ClientesMain {
	
	public static void main(String[] args) {

	ClientesDAO clienteDAO = new ClientesDAO();
		
		// ------------ Cria um Cliente e salva no banco
//		Clientes cliente = new Clientes();
//		cliente.setNome_Cliente("Cleber de Freitas");
//		cliente.setCidade_Cliente("Guarulhos");
//		cliente.setEstado_Cliente("SP");
//		cliente.setId_Contato(2);
//		cliente.setId_Destino(2);
//		cliente.setId_Promocao(2);
//		
//		clienteDAO.save(cliente); 
////		
		// ------------ Remove o Cliente com id
//			clienteDAO.removeById(3); 
	
	// ------------ Atualiza o Cliente pelo número do id com os dados do objeto cliente1
//		Clientes cliente1 = new Clientes();
//		cliente1.setId_Cliente(1);			
//		cliente1.setNome_Cliente("Julio");
//		cliente1.setCidade_Cliente("Rio Branco");
//		cliente1.setEstado_Cliente("AC");
//		cliente1.setId_Contato(1);
//		cliente1.setId_Destino(1);
//		cliente1.setId_Promocao(1);
//		
//		clienteDAO.update(cliente1); 
	
	for (Clientes cli : clienteDAO.getClientes()) {
		System.out.println("Nome do cliente: "+ cli.getNome_Cliente() +
				" \nCidade de origem: " + cli.getCidade_Cliente() + " - " + cli.getEstado_Cliente() +
				" \nE-mail de contato: " + cli.getContato().getEmail_Contato() +
				" \nTelefone para contato: " + cli.getContato().getTelefone_Contato() +
				" \nCidade de destino: " + cli.getDestino().getCidade_Destino() + " - " + cli.getDestino().getEstado_Destino() + 
				" \nValor promocional: R$ " + cli.getPromocao().getValor_Promocao() + "\n");
		
		}
		
	}
}
