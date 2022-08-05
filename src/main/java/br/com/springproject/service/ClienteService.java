package br.com.springproject.service;

import br.com.springproject.model.Cliente;

import java.util.List;

public interface ClienteService {

	/**
	 * Retorna uma lista de todos os clientes presentes no BD.
	 * @return - uma lista de clientes.
	 */
	List<Cliente> buscarTodos();

	/**
	 * Retorna um cliente do banco de dados a partir do seu identificador.
	 * @param id - id(cep) do cliente desejado.
	 * @return - retorna o cliente atrelado aquele id.
	 */
	Cliente buscarPorId(Long id);

	/**
	 * Cria e adiciona um cliente ao banco de dados.
	 * @param cliente - Passa um objeto da classe cliente.
	 */
	void inserir(Cliente cliente);

	/**
	 * Atualizar um cliente existente no banco de dados.
	 * @param id - id (cep) atrelado ao cliente que se deseja atualizar os dados.
	 * @param cliente - objeto da classe cliente que terá seus atributos atualizados.
	 */
	void atualizar(Long id, Cliente cliente);

	/**
	 *  Exclusão de um cliente especificado pelo identificador.
	 * @param id - identificador (cep) do cliente desejado.
	 */
	void deletar(Long id);

}
