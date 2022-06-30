package pe.edu.upc.uct.business.crud;

import java.util.List;

import pe.edu.upc.uct.model.entity.Authority;

public interface AuthorityService /*extends CrudService<Authority, Long> */{
	
	public void insert(Authority authority);

	List<Authority> list();

}
