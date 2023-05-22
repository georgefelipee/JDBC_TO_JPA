package br.com.george.dao.jpa;


import br.com.george.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.george.domain.Cliente;


public class ClienteJpaDAO extends GenericJpaDB1DAO<Cliente, Long> implements IClienteJpaDAO<Cliente> {

	public ClienteJpaDAO() {
		super(Cliente.class);
	}

}
