package br.com.george.dao.jpa;

import br.com.george.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.george.domain.Produto;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<Produto, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(Produto.class);
	}

}
