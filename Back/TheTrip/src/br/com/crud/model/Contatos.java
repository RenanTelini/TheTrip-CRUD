package br.com.crud.model;

public class Contatos {
	
	private int Id_Contato;
	private String Email_Contato;
	private String Telefone_Contato;
	
	public int getId_Contato() {
		return Id_Contato;
	}
	public void setId_Contato(int id_Contato) {
		Id_Contato = id_Contato;
	}
	
	//--------
	
	public String getEmail_Contato() {
		return Email_Contato;
	}
	public void setEmail_Contato(String email_Contato) {
		Email_Contato = email_Contato;
	}
	
	//--------
	
	public String getTelefone_Contato() {
		return Telefone_Contato;
	}
	public void setTelefone_Contato(String telefone_Contato) {
		Telefone_Contato = telefone_Contato;
	}
	
}
