package br.com.crud.main;

import br.com.crud.dao.DestinosDAO;
import br.com.crud.model.Destinos;

public class DestinosMain {

	public static void main(String[] args) {
		
		DestinosDAO destinoDAO = new DestinosDAO();
		
		// ------------ Cria um Destino e salva no banco
		Destinos destino = new Destinos();
		destino.setCidade_Destino("Salvador");
		destino.setEstado_Destino("BH");
		
		destinoDAO.save(destino);

		// ------------ Remove o Destino pelo id
//		destinoDAO.removeById(3); 
		
		// ------------ Atualiza o Destino pelo número do id com os dados do objeto destino1
//		Destinos destino1 = new Destinos();
//		destino1.setId_Destino(3);			
//		destino1.setCidade_Destino("Paraná");
//		destino1.setEstado_Destino("PR");
//		
//		destinoDAO.update(destino1);
		
//		// ------------ Lista todos os Destinos do banco de dados
		for (Destinos d : destinoDAO.getDestinos()) {
			System.out.println("Cidade de destino: "+ d.getCidade_Destino() + " - " + d.getEstado_Destino());
		}
	}

}
