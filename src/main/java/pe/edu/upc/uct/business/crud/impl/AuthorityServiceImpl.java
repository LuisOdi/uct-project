package pe.edu.upc.uct.business.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.uct.business.crud.AuthorityService;
import pe.edu.upc.uct.model.entity.Authority;
import pe.edu.upc.uct.model.repository.AuthorityRepository;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository aR;

	//@Override
//	public JpaRepository<Authority, Long> getJpaRepository() {
//		return this.aR;
//	}

	@Override
	public void insert(Authority authority) {
		// TODO Auto-generated method stub
		aR.save(authority);
	}

	@Override
	public List<Authority> list() {
		// TODO Auto-generated method stub
		return aR.findAll();
	}

	
	
}
