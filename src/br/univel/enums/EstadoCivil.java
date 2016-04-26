package br.univel.enums;

public enum EstadoCivil {

	SOLTEIRO("Solteiro", 1), 
	CASADO("Casado", 2),
	VIUVO("Casado", 3);
	
	private String estadocivill;
	private final int idestado;
	
	private EstadoCivil(String estadoCiv, int idestado){
		this.estadocivill = estadoCiv;
		this.idestado = idestado;
	}
	
	public String getestadoCiv() {
		return estadocivill;
	}

	public int getidestado() {
		return idestado;
	}

}

