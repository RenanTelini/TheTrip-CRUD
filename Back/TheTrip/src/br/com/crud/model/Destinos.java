package br.com.crud.model;

public class Destinos {
	
	private int Id_Destino;
	private String Cidade_Destino;
	private String Estado_Destino;
	
	public int getId_Destino() {
		return Id_Destino;
	}
	public void setId_Destino(int id_Destino) {
		Id_Destino = id_Destino;
	}
	
	//--------
	
	public String getCidade_Destino() {
		return Cidade_Destino;
	}
	public void setCidade_Destino(String cidade_Destino) {
		Cidade_Destino = cidade_Destino;
	}
	
	//--------
	
	public String getEstado_Destino() {
		return Estado_Destino;
	}
	public void setEstado_Destino(String estado_Destino) {
		Estado_Destino = estado_Destino;
	}

}
