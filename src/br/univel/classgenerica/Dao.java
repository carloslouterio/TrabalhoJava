package br.univel.classgenerica;

public class Dao {
	import java.util.List;

	import br.univel.classeinterface.Cliente;

	public interface Dao<T, K> {
		
		public void Salvar(T t);
		
		public T buscar(K k);
		
		public void atualizar(T t);
		
		public void excluir(K k);
		
		public List<T> listarTodos();

}
