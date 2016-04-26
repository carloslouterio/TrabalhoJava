package br.univel.classeinterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import anotacoes.Coluna;
import anotacoes.Tabela;

public class EstSqlGen extends SqlGen {


	@Override
	protected String getCreateTable(Connection con, Object obj) {
		
		StringBuilder sql = new StringBuilder();
		
		try{
			
			//Declaração da tabela
			{
				
				sql.append("CREATE TABLE ").append(obj).append(" ( ");
					
				
			}
			
			//Declaração das colunas
			{
			
				
			}
			
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		}
		return sql.toString();
	}

	@Override
	protected String getDropTable(Connection con, Object obj) {
		String sql = "DELETE FROM "+obj;
		System.out.println(sql);
		try(PreparedStatement ps = con.prepareStatement(sql)){
			int res = ps.executeUpdate();
			System.out.println(res + " registrados apagados");
		}catch(SQLException e){
			System.out.println("Erro ao realizar a operação de removoção da tabela " +obj);
		}
		return null;
	}

	@Override
	protected PreparedStatement getSqlInsert(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectAll(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectById(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlUpdateById(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlDeleteById(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}