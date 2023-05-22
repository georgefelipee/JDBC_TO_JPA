package br.com.george.dao;

import br.com.george.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.george.dao.jpa.IVendaJpaDAO;
import br.com.george.domain.Venda;
import br.com.george.exceptions.DAOException;
import br.com.george.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<Venda, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(Venda.class);
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public Venda consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	

}
