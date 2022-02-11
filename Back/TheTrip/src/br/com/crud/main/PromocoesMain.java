package br.com.crud.main;

import br.com.crud.dao.PromocoesDAO;
import br.com.crud.model.Promocoes;

public class PromocoesMain {

	public static void main(String[] args) {

		PromocoesDAO promocaoDAO = new PromocoesDAO();
		
		// ------------ Cria uma Promo��o e salva no banco
//		Promocoes promocao = new Promocoes();
//		promocao.setValor_Promocao(680);
//		
//		promocaoDAO.save(promocao);
//		
		// ------------ Atualiza a promo��o pelo n�mero do id com os dados do objeto promocao1
//		Promocoes promocao1 = new Promocoes();
//		promocao1.setId_Promocao(3);
//		promocao1.setValor_Promocao(242);
//		
//		promocaoDAO.update(promocao1);
		
		// ------------ Remove a promocao com id
//		promocaoDAO.removeById(3);
		
		// ------------ Lista todas as promo��es do banco de dados
		for (Promocoes p : promocaoDAO.getPromocoes()) {
			System.out.println("Valor promocional: " + p.getValor_Promocao());
		}

	} 

}
