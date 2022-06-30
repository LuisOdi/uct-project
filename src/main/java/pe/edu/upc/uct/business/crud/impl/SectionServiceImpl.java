package pe.edu.upc.uct.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.uct.business.crud.SectionService;
import pe.edu.upc.uct.model.entity.Section;
import pe.edu.upc.uct.model.repository.SectionRepository;

@Service
public class SectionServiceImpl implements SectionService{
	
	@Autowired
	private SectionRepository sectionRepository;
	
	@Override
	public JpaRepository<Section, String> getJpaRepository() {
		return this.sectionRepository;
	}
}
