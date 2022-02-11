package br.com.crud.model;

public class Clientes {

	private int Id_Cliente;
	private String Nome_Cliente;
	private String Cidade_Cliente;
	private String Estado_Cliente;
	private int Id_Contato;
	private Contatos contato; //Chave estrangeira da classe Contatos
	private int Id_Destino;
	private Destinos destino; //Chave estrangeira da classe Destinos
	private int Id_Promocao;
	private Promocoes promocao; //Chave estrangeira da classe Promocoes
	
	public int getId_Cliente() {
		return Id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		Id_Cliente = id_Cliente;
	}
	
	//--------
	
	public String getNome_Cliente() {
		return Nome_Cliente;
	}
	public void setNome_Cliente(String nome_Cliente) {
		Nome_Cliente = nome_Cliente;
	}
	
	//--------
	
	public String getCidade_Cliente() {
		return Cidade_Cliente;
	}
	public void setCidade_Cliente(String cidade_Cliente) {
		Cidade_Cliente = cidade_Cliente;
	}
	
	//--------
	
	public String getEstado_Cliente() {
		return Estado_Cliente;
	}
	public void setEstado_Cliente(String estado_Cliente) {
		Estado_Cliente = estado_Cliente;
	}
	
	//--------
	
	public int getId_Contato() {
		return Id_Contato;
	}
	public void setId_Contato(int id_Contato) {
		Id_Contato = id_Contato;
	}
	
	//--------
	
	public Contatos getContato() {
		return contato;
	}
	public void setContato(Contatos contato) {
		this.contato = contato;
	}
	
	//--------
	
	public int getId_Destino() {
		return Id_Destino;
	}
	public void setId_Destino(int id_Destino) {
		Id_Destino = id_Destino;
	}
	
	//--------
	
	public Destinos getDestino() {
		return destino;
	}
	public void setDestino(Destinos destino) {
		this.destino = destino;
	}
	
	//--------
	
	public int getId_Promocao() {
		return Id_Promocao;
	}
	public void setId_Promocao(int id_Promocao) {
		Id_Promocao = id_Promocao;
	}
	
	//--------
	
	public Promocoes getPromocao() {
		return promocao;
	}
	public void setPromocao(Promocoes promocao) {
		this.promocao = promocao;
	}
}
