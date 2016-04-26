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
