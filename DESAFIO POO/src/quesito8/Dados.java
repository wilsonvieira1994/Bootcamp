package quesito8;

import quesito1.Transporte;

public interface Dados {

	/**
	 * Adicionar transporte na base de dados.
	 * @param t {@code Transporte}
	 * @throws Exception em caso de erro na opera��o de adicionar.
	 */
	public void adicionar(Transporte t) throws Exception;
	
	/**
	 * Remove um determinado transporte da base de dados.
	 * @param t {@code Transporte}
	 */
	public void excluir(Transporte t);
	
	
}
