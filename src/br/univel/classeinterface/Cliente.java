package br.univel.classeinterface;

import anotacoes.Coluna;
import anotacoes.Tabela;
import enums.EstadoCivil;

@Tabela("CAD_CLIENTE")
public class Cliente {
	
	@Coluna(pk=true)
	private int id;
	
	@Coluna(nome="CLNOME")
	private String nome;
	
	private String endereco;
	private String telefone;
	private EstadoCivil estadocivil;
	
	public Cliente(){
		this(0, null, null, null, null);
	}
	
	public Cliente(int id, String nome, String endereco, String telefone, EstadoCivil estadocivil){
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.estadocivil = estadocivil;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	@Override
	public String toString(){
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone 
				+ ", Estado Civil=" + estadocivil;
	}
	
	
}