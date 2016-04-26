package br.univel.classeinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.univel.anotacao.Tabela;
import br.univel.enums.EstadoCivil;

public class Principal extends EstSqlGen{
	
	private Connection con;
	
	private void AbrirConexao(){
		try{
			String url = "jdbc:h2:~/trabalho";
			String user = "sa";
			String pass = "sa";
			con = DriverManager.getConnection(url, user, pass);				
		}catch(SQLException e){
			System.out.println("Falha na conexão!");
			System.out.println("Verifique a conexão com o banco de dados!");
		}

	}
	
	public Principal() throws SQLException{
		
		String strCreateTable = getCreateTable(con, Cliente.class);
		System.out.println(strCreateTable);
		
		Cliente c1 = new Cliente(1, "Carlos Luiz", "Rua Parana - 123", "(45) 5555-5555", EstadoCivil.SOLTEIRO);
		Cliente c2 = new Cliente(1, "Fatima Abadia", "Rua Guajuvira - 123", "(45) 6666-6666", EstadoCivil.CASADO);
		Cliente c3 = new Cliente(1, "Junior	Souza", "Rua Brasil - 1323", "(45) 8888-8888", EstadoCivil.VIUVO);
		
	}
	
	public static void main(String[] args) throws SQLException{
		new Principal();
	}

}