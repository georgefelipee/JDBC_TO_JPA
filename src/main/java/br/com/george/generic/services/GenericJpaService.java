package br.com.george.generic.services;

import java.io.Serializable;
import java.util.Collection;

import br.com.george.dao.generic.jpa.IGenericDAO;
import br.com.george.domain.Persistente;
import br.com.george.exceptions.DAOException;
import br.com.george.exceptions.MaisDeUmRegistroException;
import br.com.george.exceptions.TableException;
import br.com.george.exceptions.TipoChaveNaoEncontradaException;


public abstract class GenericJpaService<T extends Persistente, E extends Serializable> 
	implements IGenericJpaService<T, E> {
	
	protected IGenericDAO<T, E> dao;
	
	public GenericJpaService(IGenericDAO<T, E> dao) {
		this.dao = dao;
	}

	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}
	

}
